import java.util.Scanner;
public class For2{
	public static void main (String[] args){

		Scanner ler=new Scanner(System.in);

		int val=0, qntN=0, qntP=0, somaP=0, somaN=0, i;

		double  mediaP=0, mediaN=0;

		for (i=0;i<5;i++){
			System.out.println("Entre com um número");
			val=ler.nextInt();

			if (val>=0){
		    qntP=qntP+1;
			somaP=somaP+val;
			}

			else {
			somaN=somaN+val;
			qntN=qntN+1;
			}
	    }

	    mediaP=somaP/qntP;
	    mediaN=somaN/qntN;
	    System.out.println("A média de valores positivos é "+mediaP);
	    System.out.println("A média de valores negativos é "+mediaN);
	}
}