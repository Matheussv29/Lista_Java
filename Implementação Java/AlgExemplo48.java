import java.util.Scanner;
public class AlgExemplo48{
	public static void main (String[] args){

		Scanner ler=new Scanner(System.in);

		int  somI=0, qntP=0, num=10;

		while (num!=-1){
			System.out.println("Entre com um número para ser verificado, para encerrar digite <-1>");
			num=ler.nextInt();


			if (num!=-1){

			if (num%2==0){
			qntP+=1;
			}

		    else {
		    somI=somI+num;
		    }
			}

	    }
	    System.out.println(qntP);
	    System.out.println(somI);


	}
}
