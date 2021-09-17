import java.util.HashSet;
import java.util.Set;
public class MatriculasAlunos {
    public static void main(String[] args) {
        Set<String> matriculas = new HashSet<>();
        matriculas.add("20210001");
        matriculas.add("20210002");
        matriculas.add("20210001");
        System.out.println(matriculas);
        /*
        15.15 EXERCÍCIOS: COLLECTIONS-2-
        Ao adicionar uma matrícula repetida a um HashSet
        não conseguimos armazenar essa repetição, sendo assim,
        quando imrpimimos esse HashSet, não conseguimos ver repetições.
        Com isso, podemos concluir que a interface específica "Set" só
        tem métodos que não guardam valores repetidos, ao contrário da
        interface List, que permite que repetições ocupem diferentes
        espaços na memória, nos permitindo assim computar as repetições.
        Portanto, usar o FrameWork Collection, que é um "generic", não
        é cabível nesse código, pois não podem haver matrículas repetidas
        pois elas são pessoais (significa que só serve para um único individuo).
         */
    }
}
