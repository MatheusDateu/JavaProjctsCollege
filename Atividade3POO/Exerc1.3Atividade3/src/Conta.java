public class Conta {
    String nomeTitular;
    int numero;
    String agencia;
    double saldo;
    String dataDeAbertura;
    double rendimento;
    String chavePix;
    public double getSaldo() {
        return this.saldo;
    }

    double sacar (double valor){
        this.saldo -= valor;
        return saldo;
    }

    void deposita(double valor){
        this.saldo += valor;
    }

    double calculaRendimento(){
        this.rendimento = this.saldo*0.1;
        return rendimento;
    }
    String recuperaDadosParaImpressao (){
        String dados = "Nome do titular= " + this.nomeTitular;
        dados += "\nNúmero da conta= " + this.numero;
        dados += "\nAgência= " + this.agencia;
        dados += "\nSaldo= " + this.saldo;
        dados += "\nChave Pix= " + chavePix;
        dados += "\nRedimento= " + calculaRendimento();
        return dados;
    }
}
