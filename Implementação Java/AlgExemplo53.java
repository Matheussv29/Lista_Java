import java.util.Scanner;
	public class AlgExemplo53
	{
		public static void main(String args[])
		{

		float mediaNumeros=0;
		int num, somaNumeros=0, quantNumeros=0;

        Scanner leitura = new Scanner(System.in);

        do
        {

			System.out.println("Entre com um número e digite <0> para finalizar");
        	num = leitura.nextInt();

        	if(num!=0)
    		{
        	somaNumeros += num;
       		quantNumeros ++;
     		}
        }

        while (num!=0);
       		if (quantNumeros>0)
       		{
      		mediaNumeros = somaNumeros / quantNumeros;
			System.out.println("A média dos  números  : " + mediaNumeros);
        	}
	}
}