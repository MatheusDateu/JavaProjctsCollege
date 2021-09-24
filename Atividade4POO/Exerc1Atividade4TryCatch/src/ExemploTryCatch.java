import java.util.Scanner;
public class ExemploTryCatch {
    /*
    Exemplo de tratamento de erro através do método try/catch
    Esse código se trata da inscrição de nomes de jogadores
    que irão compor um time de futebol de salão, ou seja,
    só podem 5 jogadores (4 na linha e 1 no gol), porém,
    para fins didáticas, há a possibilidade de tentar
    informar o nome de um 6° jogador, isto ocasiona um erro
    que é tratado pelo try/catch.
    Por fim, o finally que executa ocorrendo erro ou não.
     */
    public static void main(String[] args) {
        int i;
        String[] n1 = new String[5];
        System.out.println("***Informe o nome de cada jogador do seu time de futebol de salão***");
        try{
            for (i=0; i<6; i++){
                Scanner scan = new Scanner(System.in);
                System.out.println("Informe um nome aqui= ");
                String nome = scan.nextLine();
                nome = n1[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Aviso: você só pode inserir 5 nomes de jogadores");
        }
        finally {
            System.out.println("Seus 5 primeiros jogadores estão registrados. Bom jogo!");
        }
    }
}
/*
Ativididade 4 de POO do Google ClassRoom. Questão única, parte 1 (try/catch/finally):
O método de tratamento de erro try/catch implica em resolver uma eventual exceção no próprio método em que ela for usada
sendo o try o responsável por abrigar o bloco que será executado e o catch que fica incumbido de coletar o erro e tratar
propriamente dito. Já o adendo "finally" executa o bloco contido nele independente de ocorrer um erro no try ou não.
 */