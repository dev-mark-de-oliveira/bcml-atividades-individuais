import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;


public  class Agenda {
    private List<Pessoa> lista;
    private Formatador f = new Formatador();



    public Agenda ()
    {
        this.lista = new ArrayList<>();
    }

    //Recebe um objeto do tipo pessoa e adiciona a pessoa na lista
    public void armazenarPessoa(Pessoa pessoa) {
        lista.add(pessoa);

    }



    //Recebe um nome, busca o elemento na lista e remove a pessoa caso ela exista
    public void removerPessoa(String nome) {

        nome = nome.toLowerCase();
        String finalNome = nome;
        boolean rem = lista.removeIf(x -> x.getNome().toLowerCase(Locale.ROOT).equals(finalNome));
        if (rem) {
            System.out.println("Removida a pessoa de nome: " + StringUtils.capitalize(nome));
        } else {
            System.out.println("Pessoa não localizada.");
        }
    }

    int buscarPessoa(String nome)
    {
        System.out.println("Pode haver pessoas com o mesmo nome!\n o método vai retornar o índice da primeira, apenas.\nNão é melhor refatorar?");
        return lista.indexOf(lista.stream().filter(x -> x.getNome().toLowerCase(Locale.ROOT).equals(nome.toLowerCase(Locale.ROOT))).findFirst().get());
    }// informa em que posição da agenda está a pessoa

    void exibirTodaAgenda()
    {
        System.out.println();
        lista.forEach(x-> System.out.println(x.toString()));
        System.out.println();
    }; // exibe todos os dados de todas as pessoas da agenda

    void exibirPessoa(int index)
    {
        System.out.println(lista.get(index).toString());
    }; // exibe todos os dados da pessoa que está na posição “index” da agenda na console

    //Crie um método para ordenar a lista de pessoas em ordem alfabética de nome
    public List<Pessoa> listarPessoasEmOrdemAlfabéticaDeNome()
    {

        List<Pessoa> lorden = lista.stream().sorted((p1, p2) -> StringUtils.stripAccents(p1.getNome()).compareToIgnoreCase(p2.getNome())).collect(Collectors.toList());
        lorden.forEach(System.out::println);
        return lorden;

    }

    // para ordenar a lista de pessoas em ordem alfabética de endereço;
    public void listarPessoasEmOrdemAlfabeticaDeEndereco( )
    {
        lista.sort(Comparator.comparing(p -> StringUtils.stripAccents(p.getEndereco().replaceFirst("rua |avenida |estrada |viela |alameda ", "").replaceFirst("da |das |de |do |dos ", ""))));
        lista.forEach(x-> System.out.println("Pessoa\n{\n\t" + "Nome: " + f.capitalizaNomes(x.getNome()) + "\n\t" + "Endereco: " + f.capitalizaNomes(x.getEndereco()) + "\n}"));


    }


}