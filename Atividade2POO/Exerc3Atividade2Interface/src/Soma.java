public class Soma implements InterfaceCalculadora {
    int num1;
    int num2;

    @Override
    public int calcula2num() {
        return (num1+num2);//Somando os atributos.
    }
}
