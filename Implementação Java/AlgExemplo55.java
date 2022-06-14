import java.util.Scanner;
	public class AlgExemplo55
	{
		public static void main (String args[])
		{
         Scanner leitura = new Scanner(System.in);

         int quantProd;
         float precoProd, valorItem, valorTotal=0;
         String produto;

         do
         {

          System.out.println("Entre com a descrição do produto <FIM> para finalizar");
          produto=leitura.nextLine();

          if (!produto.equals("FIM"))
          {

          System.out.println("Entre com a quantidade do produto");
          quantProd=leitura.nextInt();

          System.out.println("Entre com o preço do produto");
          precoProd=leitura.nextFloat();

          valorItem = quantProd*precoProd;

          valorTotal += valorItem;
          }
           leitura = new Scanner(System.in);
         }
         while (!produto.equals("FIM"));
         System.out.println("O valor total da compra  : " + valorTotal );
}
}