import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

import static org.apache.commons.lang3.StringUtils.lowerCase;


public class Manipulaarquivo {

    public static void main(String[] args) throws IOException {
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        String separator = ";";

        File arquivo = new File("ManipulaArquivo/listaDenomes.txt");

        try {



            //System.out.println(arquivo.getAbsolutePath());

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivo)));

            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo)));


             {

                arquivo.createNewFile();
                arquivo.setExecutable(true);
                System.out.println("\n\nARQUIVO CRIADO\n\n");
                bw.write("Pedro;Maria;Luan;Samira;Alex;Júlio;Bianca;Celina;Enzo;Bruno");
                bw.flush();
            }





        } catch (IOException e) {
            System.out.println("\nOcorreu um erro na gravação do arquivo!\n" );
            e.getLocalizedMessage();
            //e.printStackTrace();
        }

        try {


            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo)));

            String entrada;
            String saida = "";

            while ( (entrada = br.readLine()) != null && !(entrada = entrada.strip()).equals(""))
            {
                System.out.println("entrada: " + saida);
                saida += entrada + separator;

            }

            String[] nomes = saida.split(separator);

            Stream<String> sorted = Arrays.stream(nomes).sorted((a, b) -> StringUtils.stripAccents(a).compareToIgnoreCase(StringUtils.stripAccents(b)));
            sorted.forEach(x -> System.out.println(x + "\n"));

        } catch (FileNotFoundException e) {
            System.out.println("\nOcorreu um erro na leitura do arquivo!\n" );
            e.getLocalizedMessage();
            //e.printStackTrace();
        }
    }

}
