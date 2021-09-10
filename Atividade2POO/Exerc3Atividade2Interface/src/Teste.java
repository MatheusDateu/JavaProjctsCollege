public class Teste {
    public static void main(String[] args) {
        //Atribuindo valores aos atributos de cada classe, para que o método calcula2num possa ser chamado:
        Soma soma = new Soma();
        soma.num1 = 10;
        soma.num2 = 2;
        Subtracao sub = new Subtracao();
        sub.num1 = 10;
        sub.num2 = 2;
        Multiplicao mult = new Multiplicao();
        mult.num1 = 10;
        mult.num2 = 2;
        Divisao div = new Divisao();
        div.num1 = 10;
        div.num2 = 2;
        //Imprimindo o chamado do método calcula2num nas diferentes implementações:
        System.out.println("Soma= " + soma.calcula2num() + "\nSubtração= " + sub.calcula2num() +
        "\nMultiplicação= " + mult.calcula2num() + "\nDivisão= " + div.calcula2num());
    }
}
