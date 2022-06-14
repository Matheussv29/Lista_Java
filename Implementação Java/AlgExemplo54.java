import java.util.Scanner;
	public class AlgExemplo54
	{
		public static void main(String args[])
		{


		int num, somaNumeros=0;

        Scanner leitura = new Scanner(System.in);

        do
        {

			System.out.println("Entre com um número e digite <0> para finalizar");
        	num = leitura.nextInt();
        	if (num>5)
       		{
       		somaNumeros+=num;
       		}
        }


        while (num!=0);

        	System.out.println("A soma dos  números é: " + somaNumeros);

	}
}