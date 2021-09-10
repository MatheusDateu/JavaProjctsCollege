/*
A principal vantagem de utilizar o conceito de herança em POO é a reutilização de códigos,
possibilitando assim a diminuição significativa de códigos redundantes, ou seja,
linhas de códigos repetidas em uma ou mais classes.
E a principal desvantages é o risco de aumentar demasiadamente o acoplamento, ou seja,
fazer muitas classes ficarem dependentes da super classe.
 */
public class Pessoa {
    String nome;
    String cpf;
    String numContato;
    String dataNascimento;
    //Método para imprimir os dados da classe Pessoa.
    String imprimeDadosPessoa(){
        String dados = "Nome= " + nome + "\n";
        dados += "CPF= " + cpf + "\n";
        dados += "Telefone= " + numContato + "\n";
        dados += "Data de nascimento= " + dataNascimento + "\n";
        return dados;
    }
}
