import java.util.LinkedHashMap;
import java.util.Scanner;
  
public class JuegoDaVeia{
    public static String[][] matrizNovaStr (int n_linhas, int n_colunas){
        int i, j;
        String[][] matriz = new String[n_linhas][n_colunas];
        for(i=0;i<jogo.length;i++){
            for(j=0;j<jogo[0].length;j++){
            matriz[i][j] = "_";
            }
        }
    }
    public static void jogada(String[][] jogo, String marcador){
        int linha, coluna;
        System.out.println("entre com a linha e coluna: ");

        linha = entrada.nextInt();
        coluna = entrada.nextInt();

        jogo[linha][coluna] = marcador; 
    }
    public static void mostraJogo(String[][] jogo){
        int i, j;
        
        for(i=0;i<jogo.length;i++){
            for(j=0;j<jogo[0].length;j++){
                System.out.printf("%s ", jogo[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean jogoGanho(String[][] jogo,String marcador){

        int i, j;
        //Linhas
        for(i=0;i<3;i++){
            if(jogo[i][0].equals(marcador) && jogo[i][1].equals(marcador) && jogo[i][2].equals(marcador)){
                return true;
            }
        }
        //Colunas
        for(j=0;j<3;j++){
            if(jogo[0][j].equals(marcador) && jogo[1][1].equals(marcador) && jogo[2][j].equals(marcador)){
                return true;
            }
        }
        // verifica primeira linha
        // verifica segunda linha 
        // verifica terceira linha 
        // verifica primeira coluna
        // verifica segunda coluna 
        // verifica terceira coluna 

        // verifica diagonal principal 
        if(jogo[0][0].equals(marcador) && jogo[1][1].equals(marcador) && jogo[2][2].equals(marcador)) 
        || (jogo[0][2].equals(marcador) && jogo[1][1].equals(marcador) && jogo[2][0].equals(marcador)){
            return true;
        }

        // verifica diagonal secundaria

        return false;
    }

    public static String jogar(){
        String [][] jogo = matrizNovaStr(3, 3);
        int jogadas = 0;

        while(jogadas < 9){
            mostraJogo(jogo);
            if(jogadas%2 == 0){
                //jogador 1 jogando
                jogada(jogo, "X");
            }else{
                //jogador 2 jogando
                jogada(jogo, "O");
            }
            if(jogoGanho(jogo, "X")){
                return "jogador 1";
            }
            if(jogoGanho(jogo, "O")){
                return "jogador 2";
            }
            jogadas++;
        }
        return "empate!";
    }
    public static void main(String[] args){
        System.out.println("### JOGO DA VELHA ###");

        System.out.println("Ganhador: %s\n", jogar());
    }
}
