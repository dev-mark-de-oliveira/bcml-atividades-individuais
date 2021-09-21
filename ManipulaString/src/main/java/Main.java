import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void palindromo()
    {
        String frase = "";
        boolean ehPalindromo = false;
        Scanner input = new Scanner(System.in);

        System.out.println("\n______________________PALÍNDROMO______________________\n");
        System.out.println("Digite o texto desejado!\n\n");

        frase = input.nextLine();
        
        String fraseProcessada = frase.replaceAll(" |,|-|;|_|\\+", "");


        int comprimento = fraseProcessada.length();
        int metade = comprimento/2;

        for (int i = 0; i < metade; i++)
        {
               if (fraseProcessada.charAt(i) != fraseProcessada.charAt(comprimento-(1+i)))
               {
                   System.out.println( frase.toUpperCase(Locale.ROOT) + '\'' + " NÃO É um palíndromo!\n");
                   input.close();
                   return;
               }


        }

        System.out.println("A palavra " + '\'' + frase.toUpperCase(Locale.ROOT) + '\'' +  " É um palíndromo!\n");
        //input.close();
    }

    public static void inversor()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\n______________________INVERTER______________________\n");
        System.out.println("Digite o texto desejado!\n\n");

        String entrada = input.nextLine().toUpperCase(Locale.ROOT).strip();
        String saida = "";

        for(int i = entrada.length()-1; i >= 0; i--)
        {
            saida += entrada.charAt(i);
        }

        System.out.println("Eis o texto invertido:\n");
        System.out.println(saida);





//        input.close();
    }

    public static void main(String[] args) {



        System.out.println("\n___________JOGO_____DAS_____PALAVRAS__________\n");

        String entrada;
        do {

            Scanner scanner = new Scanner(System.in);
            entrada = "";
            System.out.println(
                    "Digite uma opção:\n" +
                            "INVERSOR\n" +
                            "PALINDROMO\n"
                            + "...ou qualquer outra coisa para finalizar o programa :)"

            );


            entrada = scanner.nextLine().toUpperCase(Locale.ROOT).strip();

            switch (entrada)
            {
                case "INVERSOR":
                {
                    inversor();
                    break;
                }
                case "PALINDROMO":
                {
                    palindromo();
                    break;
                }

                default:
                {
                    entrada = "QUIT";
                }

                //scanner.close();

            }

        } while (!(entrada.equals("QUIT") || entrada.equals(null)));


    }
}
