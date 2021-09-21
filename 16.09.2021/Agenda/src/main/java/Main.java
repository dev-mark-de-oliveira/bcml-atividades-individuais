import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Pessoa p1 = new Pessoa("Samara Camilo", "Rua da Mangaba, 151 - Cotia, SP", "358-23",23, 1.73 );
        Pessoa p2 = new Pessoa("BRUNO SANTOS", "AVENIDA DOS CIGANOS, 456 - BARUERI, SP", "674-10", 54, 1.80);
        Pessoa p3 = new Pessoa("João Toschini", "Rua Índia Anahi, 21 - Ceilândia, DF", "345-78", 33, 1.65);
        Pessoa p4 = new Pessoa("Édson Ali", "Alameda Nadatemo, 548 - Santarém, PA", "258-32", 42, 1.79 );
        Pessoa p5 = new Pessoa("zulmira scheiner", "rua da mata, 43 - registro, SP", "234-65", 18, 1.77);
        Pessoa p6 = new Pessoa("antônio silva", "avenida ondina, 345 - salvador, BA", "457-34", 26, 1.88);
        Pessoa p7 = new Pessoa("Maria das Dores", "EsTrAda d0 FAdO, 34 - SãO PaulO, SP", "234-45", 56, 1.49);
        Pessoa p8 = new Pessoa("AkeMi TokuHaRa", "aVenIda BonAire, 43 - Belo hOrIzoNtE, MG", "634-45", 34, 1.70);
        Pessoa p9 = new Pessoa("Simone Simara", "estrada do AguaRDente, 43 - manaus, AM", "427-43", 43, 1.72);
        Pessoa p10 = new Pessoa("AMARILDO APARECIDO", "RUA DA ESPERANÇA, 43 - RIO DE JANEIRO - RJ", "234-12", 54, 1.82 );

        List<Pessoa> lista =  new ArrayList<>();
        lista.addAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));

        Agenda agenda = new Agenda();
        String bigBreak = "\n____________________________________________________\n";



        System.out.println(StringUtils.stripAccents(p9.getEndereco().replaceFirst("rua |avenida |estrada |viela |alameda ", "").replaceFirst("(\" da \"|\" das \"|\" de \"|\" do \"|\" dos \")", "")));

        System.out.println("Armazenando as pessoas:" + bigBreak);
        lista.forEach(agenda::armazenarPessoa);

        System.out.println("removendo uma pessoa escolhida (Samara Camilo)");
        agenda.removerPessoa("Samara Camilo");
        System.out.println(bigBreak);

        System.out.println("removendo uma pessoa inexistente (Tom Domenico)");
        agenda.removerPessoa("Tom Domenico");
        System.out.println(bigBreak);

        System.out.println("\nlistando todas as pessoas:\n");
        agenda.exibirTodaAgenda();
        System.out.println(bigBreak);


        System.out.println("\nlistando todas as pessoas por ordem de endereço (considera o tipo de logadouro):\n");
        agenda.listarPessoasEmOrdemAlfabeticaDeEndereco();
        System.out.println(bigBreak + " ");


        System.out.println( "\nExibindo uma pessoa em específico (índice 2º):");
        agenda.exibirPessoa(1);
        System.out.println(bigBreak);

        System.out.println("Exibir a lista ordenada por nome:");
        agenda.listarPessoasEmOrdemAlfabéticaDeNome();
        System.out.println(bigBreak);




    }
}
