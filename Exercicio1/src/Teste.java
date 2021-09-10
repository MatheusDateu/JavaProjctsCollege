public class Teste{
    public static void main(String[]args){
        Conta c1 = new Conta();
        c1.nomeTitular = "Matheus";
        c1.numero = 123;
        c1.agencia = "45678-9";
        c1.saldo = 50.0;
        c1.chavePix = "123.456.123-45"; //Nesse caso, a chave Pix é um CPF.
        Data d1 = new Data();
    /*Quando fora testado chamar o método recuperaDadosParaImpressao ocorreu o erro
    com a seguinte mensagem "java: not a statement", o que signifíca que não se pode chamá-lo
    sem que tenha um "valor" para imprimir na tela.
    */
        d1.dia = 8;
        d1.mes = 8;
        d1.ano = 2018;
        c1.dataDeAbertura = d1;

        Conta c2 = new Conta();
        c2.nomeTitular = "Matheus";
        c2.numero = 123;
        c2.agencia = "45678-9";
        c2.saldo = 50.0;
        //c2.dataDeAbertura = "04/06/2015";

        c2 = c1;

        if (c1 == c2){
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
        //Quando atribuímos c1 a c2 fazemos com que o if seja sempre igual, pois ambos se tornam referencial para o mesmo objeto;

        c1.Depositar(100.0);
        /*
        código antigo que fora substituído pelo mais completo "recuperaDadosParaImpressao":
        System.out.println("Saldo atual= " + c1.saldo);
        System.out.println("Rendimento mensal= " + c1.calculaRendimento());
         */
        System.out.println("\n" + c1.recuperaDadosParaImpressao());
        /*
        Conta.saldo = 1234;
        Essa linha gera o erro "Non-static field 'saldo' cannot be referenced from a static context"
        E quer dizer que o campo não estático "saldo" não pode ser referenciado de um contexto estático
        Logo, esse código não faz sentido, pois precisa-se criar um objeto e instânciá-lo para que possa-se atribuir-lhe "valor".
         */
        /*
        Conta.calculoRedimento();
        Essa linha de código gera o erro "Cannot resolve method 'calculoRedimento' in 'Conta'"
        Isso significa que não foi possível executar o método calculoRedimento na Classe Conta
        Isso se dá ao simples fato de que não há um método main nessa classe, muito menos objetos instanciados que retornem algum valor.
         */
        //Não faz sentido perguntar ao esquema da Conta o seu valor anual, já que ela não tem método tampouco atributo que possibilite isso.
    }
}