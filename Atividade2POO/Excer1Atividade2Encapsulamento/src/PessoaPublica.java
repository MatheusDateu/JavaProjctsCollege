/*
O encapsulamento dos dados é um mecanismo utilizado para reunir os dados e os métodos numa estrutura que pode esconder
a implementação do objeto, ou seja, ele impede o acesso aos dados por um meio diferente dos serviços propostos.
A encapsulação garante, desta maneira a integridade dos dados contidos no objeto.
 */
public class PessoaPublica {
    //Abaixo um exemplo de encapsulamento dos atributos de uma classe "Pessoa":
    private String nome;
    private String cpf;
    private String dataNascimento;
    protected String senha;

    //Criando um método que atribui valores aos atributos privados de dentro da classe em que foram declarados.
    String atribuidorDeValores() {
        dataNascimento = "12/12/2012";
        return dataNascimento;
    }
    //Criando métodos para inserir valor por parâmetro ao atributo cpf e coletar esse valor, respectivamente.
    public void setCPF(String cpfisica) {
        this.cpf = cpfisica;
    }

    public String getCPF() {
        return this.cpf;
    }
}