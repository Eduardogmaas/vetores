import java.util.Scanner;

class Cartao{
    String nome, numero, bandeira;
    int cvv;
    int vencimento_mes, vencimento_ano;
}

public class Main{
    public static void main(String[] args){
        Cartão cliente_1 = new Cartao();
        Scanner entrada = new Scanner(System.in);

        System.err.println("");
        System.out.println("dados do cartrao");
        System.out.printf("nome: ");
        cliente_1.nome = entrada.nextLine();
        System.out.printf("nuumero do cartao");
        cliente_1.numero = entrada.nextLine();
        System.out.printf("bandeira");
        cliente_1.bandeira = entrada.nextLine();
        System.out.printf("mes e ano de vencimento");
        cliente_1.vencimento_mes = entrada.nextInt();
        cliente_1.vencimento_ano = entrada.nextInt();
        System.out.printf("codigo verificacao: ");
        cliente_1.cvv = entrada.nextInt();

    }
    public static void registroPreencheCartao(Cartao cartao){
        Cartão c = new Cartao();
        
        
        System.out.println("dados do cartrao");
        System.out.printf("nome: ");
        c.nome = entrada.nextLine();
        System.out.printf("nuumero do cartao");
        c.numero = entrada.nextLine();
        System.out.printf("bandeira");
        c.bandeira = entrada.nextLine();
        System.out.printf("mes e ano de vencimento");
        c.vencimento_mes = entrada.nextInt();
        c.vencimento_ano = entrada.nextInt();
        System.out.printf("codigo verificacao: ");
        c.cvv = entrada.nextInt();

        return c;
    }
    public static void registroCartaoPrint(Cartao cartao){
        System.out.println("Nome      : "+cliente_1.nome);
        System.out.println("numero    : "+cliente_1.numero);
        System.out.println("bandeira  : "+cliente_1.bandeira);
        System.out.println("vencimento: "+cliente_1.vencimento_mes+"/"+cliente_1.vencimento_ano);
        System.out.println("CVV      : "+ cliente_1.cvv);
    }
    public static void main(String[] args){
        Cartao cliente_1;

        int[] numeros = new int[10];
        Cartao[] cartoes = new Cartao[10];

        System.err.println("==== NOVO SISTEMA DA AMAZON ====");
        cliente_1 = registroPreencheCartao();
        registroCartaoPRint(cliente_1);
    }
}