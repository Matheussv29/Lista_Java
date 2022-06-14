import java.util.Scanner;
public class AlgExemplo33{
	public static void main (String[] args){

		Scanner ler=new Scanner(System.in);

		double num1, num2, num3, num4, num5, valSoma, valMedia, valDobro;

		System.out.println("Entre com 5 números");
		num1=ler.nextDouble();
		num2=ler.nextDouble();
		num3=ler.nextDouble();
		num4=ler.nextDouble();
		num5=ler.nextDouble();

		valSoma=(num1+num2+num3+num4+num5);
		 System.out.println("O valor da soma dos números digitados é "+valSoma);

		valMedia=(num1+num2+num3+num4+num5)/5;
		  System.out.println("O valor da média dos números digitados é "+valMedia);

		valDobro=(num1+num2+num3+num4+num5)*2;
		  System.out.println("O valor do dobro dos números digitados é "+valDobro);

    }
}