import java.util.List;
import java.util.ArrayList;
public class ExArrayList {
    public static void main(String[] args) {
        List<String> nomeAluno = new ArrayList<>();
        nomeAluno.add("Anabel");
        nomeAluno.add("Matheus");
        nomeAluno.add("Briana");
        nomeAluno.add("Kalleby");
        nomeAluno.add("Matheus");
        System.out.println(nomeAluno);
        /*
        A vantagem de se usar ArrayList é poder repetir dados
        com isso, pode-se realizar a inserção de dados de forma
        mais veloz do que quando usamos HashSet, por exemplo.
        Outrossim, pode-se verificar quantos valores foram repetidos,
        caso desejado.
         */
    }
}