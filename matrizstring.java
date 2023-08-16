class Matrizes{
    public static int[][] matrizNovaInt(int numero_linhas, int numero_colunas){
        int [][] matriz;
        matriz = new int[numero_linhas][numero_colunas];
        return matriz;
    }
    public static String[][] matrizNovaString(int numero_linhas, int numero_colunas){
        String [][] matriz;
        matriz = new String[numero_linhas][numero_colunas];
        return matriz;
    }
    public static void matrizPrintInt (int [][] matriz){
        int i, j;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[0].length;j++){
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
    public static void matrizPrintString (String [][] matriz){
        int i, j;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[0].length;j++){
                System.out.printf("%s ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static int [][] matrizPreencherInt(int[][] matriz, int valor){
        int i, j;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[0].length;j++){
                matriz[i][j] = valor;
            }
        }
        return matriz;
    }
    public static String [][] matrizPreencherString(String[][] matriz, String valor){
        int i, j;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[0].length;j++){
                matriz[i][j] = valor;
            }
        }
        return matriz;
    }
    public static int[] matrizGetLinhaInt (int [][] matriz, int i){
        int i, j;
        int [] linha;

        linha = new int[matriz[0].length];
        for(j=0;j<linha.length;j++){
            linha[j] = matriz[][];            
        }        

        return matriz[i];
    }
    public static int[] matrizGetColunaInt (int [][] matriz, int c){
        int j;
        int [] coluna;

        coluna = new int[matriz.length];
        for(j=0;j<coluna.length;j++){
            coluna[j] = matriz[j][c];            
        }        

        return matriz[i];
    }

    public static void vetorPrintInt(int [] vetor){
        int i;
        for(i=0;i<vetor.length;i++){
            System.out.printf("%d ", vetor[i]);          
        }
        System.out.println();
    }
    public static void vetorVetoresIguaisInt(int ){
        
    }
    public static void main(String[] args){
        int [][] m;
        int [] l;
        int [] c;
        int n_linhas = 4, n_colunas = 6;
        int valor = 5;
        int linha = 1;

        m = matrizNovaInt(n_linhas, n_colunas);
        m = matrizPreencherInt(m, valor);
        matrizPrintInt(m);
        l = matrizGetLinhaINt(m, linha);
        l = matrizGetLinhaINt(m, c);
        System.out.println("=====");
        vetorPrintInt(l);
        m[1][3] = 0;
        System.out.println("=====");
        vetorPrintInt(l);
    }
}