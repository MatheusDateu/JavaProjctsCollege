import java.util.Scanner;

public class ExemploThrow {
    protected static void calculaDivisao() throws Exception {
        int num;
        int divisor;
        int result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe dividendo= ");
        num = scan.nextInt();
        System.out.println("Informe denominador= ");
        divisor = scan.nextInt();
        try {
            result = num / divisor;
        } catch (ArithmeticException exce){
            throw new Exception(exce);
        }
        System.out.println("Operação= "+ num + "/" + divisor + "= " + result);
    }
    public static void main(String[] args) {
        try{
            calculaDivisao();
        }
        catch (Exception exce){
            System.out.println("Erro aritimético! O programa não pôde dividir esses valores");
        }
    }
}
/*
Ativididade 4 de POO do Google ClassRoom. Questão única, parte 1 (throw/throws):
O método de tratamento de exceção throw é sobre passar uma exceção para ser corrigida/tratada em outro método. Para
indicar que um método contém um throw, usa-se a palavra "throws", já para passar uma exceção para  o método chamado de
"caller", ou em português, chamador, isto é, o método que chama o método que pode pode apresentar uma "exception",
fazendo com que ele - o caller - seja responsável por tratar o erro. Também há a possibilidade de um método passar pra
outro, que também poderá passar pra outro e assim sucessivamente até chegar em algum que trate o erro.
 */