import java.util.Scanner;
public class AlgExemplo49{
	public static void main (String[] args){

		Scanner ler=new Scanner(System.in);

		int  somP=0, contn=0, num=10;

		while (num!=0){
			System.out.println("Entre com um número para ser verificado, para encerrar digite <0>");
			num=ler.nextInt();


			if (num!=0){

			if (num<0){
			contn+=1;
			}

		    else {
		    somP=somP+num;
		    }
			}

	    }
	    System.out.println(contn);
	    System.out.println(somP);


	}
}
