public class Conta {
    String nomeTitular;
    int numero;
    String agencia;
    double saldo;
    Data dataDeAbertura;
    double rendimento;
    String chavePix; //Implementando chave Pix.

    double sacar (double valor){
        this.saldo -= valor;
        return saldo;
    }

    void Depositar(double valor){
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
        /*
        Como era antes do exercício 7:
        dados += "\nData de abertura da conta= " + this.dataDeAbertura;
         */
        dados += "\nRedimento= " + calculaRendimento();
        /*
        Código antes da questão 9:
        dados += "\nDia= " + this.dataDeAbertura.dia;
        dados += "\nMês= " + this.dataDeAbertura.mes;
        dados += "\nAno= " + this.dataDeAbertura.ano;
         */
        dados += "\nData de abertura da conta= " + this.dataDeAbertura.formatar();
        return dados;
    }
}
