public class Aluno extends Pessoa{
    public String matriculaAluno;
    public String semestreCursando;
    //O método que imprime os dados da classe aluno.
    String imprimeDadosAluno(){
        String dados2 = "Matrícula= " + matriculaAluno + "\n";
        dados2 += "Semestre= " + semestreCursando + "º";
        return dados2;
    }
}
