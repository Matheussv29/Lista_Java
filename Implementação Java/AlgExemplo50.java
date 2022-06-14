import java.util.Scanner;

public class AlgExemplo50 {

    public static void main(String[]args) {
    	Scanner ler = new Scanner(System.in);
    	int  preco_unitario, qnt, preco_total=0;
    	String desc_produto = "aa";

    while (!"FIM".equals(desc_produto)) {
    	System.out.println("Entre com a descrição do produto, para encerrar digite FIM");
        desc_produto = ler.nextLine();

	if (!"FIM".equals(desc_produto)) {

		System.out.println("Entre com o preço do produto");
		preco_unitario = ler.nextInt();

    	System.out.println("Entre com a quantidade");
    	qnt = ler.nextInt();

    	preco_total = preco_unitario * qnt;


    	}

    	}


   		System.out.println("O preço total é :" + preco_total);
    }
}