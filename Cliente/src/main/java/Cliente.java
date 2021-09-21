import java.util.Locale;

public class Cliente {



    public Cliente(String nome, String cpf, String email, String telefone) {
        this.nome = nome;

        this.cpf  = cpfValido(cpf);
        if (valido) this.email = emailValido(email);
        if (valido) this.telefone = telefoneValido(telefone);

    }

    private String invalida ()
    {
        final String INVALIDO = "INVÁLIDO";
        cpf = email = telefone = nome = INVALIDO;
        return INVALIDO;
    }
    private String telefoneValido(String telefone) {

        if(!telefone.matches("[\\d]{11}"))
        {
            return invalida();

        }

        return telefone;
    }

    private String emailValido(String email) {





        if (!(email.toLowerCase(Locale.ROOT)).matches("[(\\w)]{6,}@[a-z]{4,}.[a-z]{2,}[.a-z]{0,1}"))
        {
            System.out.println("Te falaram que aqui só aceita arroba na string pra validar. Mas aqui tem que ser algo mais realista!\nO dev já tá estudando rgex :)\n");
            return invalida();
        }



        return email;
    }

    private String cpfValido(String cpf) {

        boolean matchesPontoTraco = cpf.matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}");
        boolean matchesSoNumero = cpf.matches ("[0-9]{11}");
        final int digitoscpf = 11;

        int soma_9prim = 0;
        int soma_10prim = 0;
        int soma_11dig = 0;

        String result = cpf;
        int [] vetorcpf;

        if (matchesPontoTraco)
        {
            result = result.replace(".", "");
            result = result.replace("-", "");
        }

        if (!matchesSoNumero)
        {
            System.out.println("Nem tem a quantidade certa de caracteres para um cpf!\n");
            return invalida();
        }


        //tratando o cpf

        vetorcpf = result.chars().map(x-> x - '0').toArray();

        int fact = 10;
        for (int i = 0; i < 9; i++)
        {
            soma_9prim += fact*vetorcpf[i];
            fact--;
        }


        if (vetorcpf[9] != ((soma_9prim*10)%11)%10)
        {
            //throw cpf invalido

            System.out.println("confira o final do seu cf: " + vetorcpf[9] + "  " + soma_9prim%11%10);
            return invalida();
        }

        fact = 11;
        for (int i = 0; i < 9; i++)
        {
            soma_10prim += fact*vetorcpf[i];
            fact--;
        }

        if (vetorcpf[10] != ((soma_10prim*10)%11)%10)
        {
            System.out.println("trocou o último dígito, né?" + vetorcpf[10] + "  " + soma_10prim%11%10);
            return invalida();
        }

        System.out.println("CPF validado com sucesso!");
        return cpf;



    }



    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private boolean valido;

}
