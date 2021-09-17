import java.util.HashMap;
import java.util.Map;
public class TestaMapa {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.deposita(10000);
        Conta c2 = new Conta();
        c2.deposita(3000);
        // cria o mapa
        Map <String, Conta> mapaDeContas = new HashMap<>();
        /*
        15.15 EXERCÍCIOS: COLLECTIONS-3-
        Foi usada a terceira opção.
         */
        // adiciona duas chaves e seus valores
        mapaDeContas.put("diretor", c1);
        mapaDeContas.put("gerente", c2);
        // qual a conta do diretor?
        Conta contaDoDiretor = mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());
    }
}
