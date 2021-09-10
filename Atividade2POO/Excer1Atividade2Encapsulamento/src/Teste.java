public class Teste {
    public static void main(String[] args){
        PessoaPublica pessoaP = new PessoaPublica();
        /*
        pessoaP.nome = "Mathus";
        Essa linha de código faz com que o seguinte erro apareça "'nome' has private access in 'PessoaPublica'"
        Ou seja, não temos acesso a um atributo Private dentro de uma classe diferente da em que ela foi declarada.
         */
        pessoaP.setCPF("000.111.222-33");
        pessoaP.senha = "0I2EA56";
        /*
        Já no caso de atributo "Protected" temos acesso mesmo numa classe diferente, contanto que estejamos tentando
        acessá-la de dentro de um mesmo pacote.
         */
        //Imprimindo dados conseguidos.
        System.out.println("Senha= " + pessoaP.senha + "\n" + "CPF= " + pessoaP.getCPF() + "\n" +
        "Data de nascimento= " + pessoaP.atribuidorDeValores());
    }
}
