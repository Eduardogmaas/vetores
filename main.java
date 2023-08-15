import java.util.Scanner;

class Main{
    public static Scanner entrada;

    public static int[][] matrizLeitura(int n_linhas, int n_colunas){
        int [][] matriz = new int[m_linhas][n_colunas];
        int i, j;

        System.out.printf("", n_linhas, n_colunas);
        for(i=0;i<n_linhas;i++){
            for(j=0;j<n_colunas;j++){
                matriz [i][j] = 
            }
        }
    }

    public static void main (String[] args){
        // int[][] v = {{10, 20, 30, 40},
        //              {50, 60, 70, 80},       exemplo 1
        //              {90, 100, 110, 120},
        //              {130, 140, 150, 160}}; esse só precisa do FOR a partir da linha 64
        int[][] matriz;
        // int valor = 10; exemplo 2
        // int valor = 0;  //exercicio 1 com matriz
        int i, j, cont = 0;
        int n_linhas = 4, n_colunas = 4;
        // int n_linhas = 7, n_colunas = 7;
        Scanner sc = new Scanner(System.in);

        matriz = new int[n_linhas][n_colunas];

        // System.out.printf("informe matriz");
        // sc = entrada.nextInt();
        // entrada.close();

        for(i=0;i<n_linhas;i++){
            for(j=0;j<n_colunas;j++){
                matriz[i][j] = sc.nextInt(); // valor; // exemplo 2
                    if(i < 10 || j < 10){
                        cont++;
                    }
                // valor = valor + 10;
                // if(i==0){ // exercicio 1 com matriz
                //     matriz [i][j] = 1; // exercicio 1 com matriz esse faz a primeira linha ficar tudo 1
                // }else{
                //     if(i==n_linhas-1){
                //         matriz [i][j] = 1; // esse faz a ultima linha ficar tudo 1
                //     }else{
                //         if(j==0){
                //             matriz [i][j] = 1; // esse faz a primeira coluna ficar tudo 1
                //         }else{
                //             if(j==n_colunas-1){
                //                 matriz[i][j] = 1; // esse faz a ultima coluna ficar tudo 1 // esse foi o primeiro jeito de resolver a matriz com 1 e 9
                //             }else{
                //                 matriz[i][j] = 9; // esse completou com tudo 9 no centro
                //             }
                //         }
                //     }
                // }
        //         if(i == 0 || j == 0 || i == n_linhas - 1 || j == n_colunas - 1){
        //             matriz[i][j] = 1;
        //         }else{
        //             matriz[i][j] = 9; // esse foi o segundo jeito de resolver kkkk
        //         }
             }
        }
        
        for(i=0;i<n_linhas;i++){
            for(j=0;j<n_colunas;j++){
                System.out.printf("%d ", matriz[i][j]); //exemplo 1
                System.out.printf("Tem %d menores do que 10 ", cont);
            }
            System.out.println();
        }
    }
}