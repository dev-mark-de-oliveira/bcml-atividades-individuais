import java.util.Scanner;

public class TestaClente {

    public static Cliente cadastra()
    {
        String nome, cpf, email, telefone;
        String entrada;
        Scanner input = new Scanner(System.in);
        System.out.println(
                "\n\n" +
                "CADASTRO DO CLIENTE" +
                "\n" +
                "_______________________________" +
                "\n"
        );

        System.out.println("\n1 - Digite o NOME do cliente");
        nome = input.nextLine();
        System.out.println("\n2 - Digite o CPF do cliente");
        cpf = input.nextLine();
        System.out.println("\n3 - Digite o E-MAIL do cliente");
        email = input.nextLine();
        System.out.println("\n4 - Digite o TELEFONE do cliente");
        telefone = input.nextLine();

        return new Cliente (nome, cpf, email, telefone);

    }

    public static void main(String[] args) {

        Cliente c = cadastra();
        c.toString();



    }
}
