public class TesteHeranca {
    public static void main(String[] args) {
        //Criando um objeto instanciado na classe filha "Aluno".
        Aluno a1 = new Aluno();
        //Atribuindo valores para o objeto "a1".
        a1.nome = "Matheus Delmondes";
        a1.cpf = "000.111.222.33";
        a1.numContato = "+55 095 9 91XX-XXXX";
        a1.dataNascimento = "08/05/2001";
        a1.matriculaAluno = "202010036";
        a1.semestreCursando = "3";
        //Imrpimindo os dados retornados pelos métodos criados para imprimir todos os dados da superclasse e da classe filha.
        System.out.println(a1.imprimeDadosPessoa() + a1.imprimeDadosAluno());
    }
}