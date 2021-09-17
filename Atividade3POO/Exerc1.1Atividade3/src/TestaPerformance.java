import java.util.Collection;
import java.util.ArrayList;
import  java.util.HashSet;
import java.util.HashMap;

public class TestaPerformance {
    public static void main(String[] args) {
        System.out.println("Iniciando...");
        Collection<Integer> teste = new ArrayList<>();
        long inicioInserção = System.currentTimeMillis();
        int total = 30000;
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        long fimInserção = System.currentTimeMillis();
        long tempoInserção = fimInserção - inicioInserção;

        long inicioBusca = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }

        long fimBusca = System.currentTimeMillis();
        long tempoBusca = fimBusca - inicioBusca;
        long tempoTotal = fimBusca - inicioInserção;
        System.out.println("Tempo gasto na Inserção: " + tempoInserção);
        System.out.println("Tempo gasto na busca: " + tempoBusca);
        System.out.println("Tempo gasto na busca total: " + tempoTotal);
    }
}
/*
15.15 EXERCÍCIOS: COLLECTIONS-1-
Arraylist:
Tempo gasto: 864;
Tempo de inserção: 4;
Tempo de busca: 720;
Tempo de busca total: 724;

HashSet:
Tempo gasto: 20;
Tempo de inserção: 23;
Tempo de busca: 6;
Tempo busca total: 29;

Enquanto no ArrayList a inserção de dados é muito mais rápida do que a busca,
no HashSet é justamente o contrário, na inserção de dados é bem mais lento, mas na busca é mais veloz.
 */