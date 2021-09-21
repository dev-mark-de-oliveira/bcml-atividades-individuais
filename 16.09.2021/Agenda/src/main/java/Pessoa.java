import org.apache.commons.lang3.StringUtils;
import java.util.Formatter;

public class Pessoa
{
//    Crie uma classe Pessoa, com os atributos String nome, String endereco, String telefone, Integer idade, Double altura;
//    Crie um método construtor com todos os atributos da classe Pessoa
//    Crie os métodos Getter e Setter para todos os atributos
//    Sobrescreva o método toString( ) para a classe Pessoa
//    Crie uma classe Agenda que possa receber uma lista de pessoas;
//    Além disto esta classe deve ter os seguintes métodos:
//    void armazenarPessoa(Pessoa pessoa);//Recebe um objeto do tipo pessoa e adiciona a pessoa na lista
//    void removerPessoa(String nome);//Recebe um nome, busca o elemento na lista e remove a pessoa caso ela exista
//    int buscarPessoa(String nome); // informa em que posição da agenda está a pessoa void exibirTodaAgenda(); // exibe todos os dados de todas as pessoas da agenda void exibirPessoa(int index); // exibe todos os dados da pessoa que está na posição “index” da agenda na console



    public String getNome() {
        return nome;
    }



    @Override
    public String toString() {
        return "\nPessoa\n{\n" +
                "\tnome:\t" + f.capitalizaNomes(nome) + '\n' +
                "\tendereco:\t" + f.capitalizaNomes(endereco) + '\n' +
                "\ttelefone:\t" + telefone + '\n' +
                "\tidade:\t" + idade + '\n' +
                "\taltura:\t" + altura + '\n' +
                "\n}";
    }

    private String nome;
    private String endereco;
    private String telefone;
    private Integer idade;
    private Double altura;
    private Formatador f = new Formatador();



    public String getEndereco() {
        return endereco.toLowerCase();
    }

    public void setEndereco(String endereco) {       ;

    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }





    public Pessoa(String nome, String endereco, String telefone, Integer idade, Double altura) {
        this.nome = nome.toLowerCase();
        this.endereco = endereco.toLowerCase();
        this.telefone = telefone;
        this.idade = idade;
        this.altura = altura;
    }



}
