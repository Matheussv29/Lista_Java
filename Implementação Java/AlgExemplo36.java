import java.util.Scanner;
 public class AlgExemplo36{
 	public static void main (String[] args){

 		Scanner ler=new Scanner (System.in);

 		int idade, qntI2=0, i=0,qntI=0;

 		while (i<10){
 			System.out.println("Entre com a idade");
 			idade=ler.nextInt();

 			if (idade<21){
 				qntI=qntI+1;

 		}
 		   else if (idade>50){
 			    qntI2=qntI2+1;

 		}
 		  else {
 		  	System.out.println();
 		  }

 		i++;
 		}
 		System.out.println("A quantidade de pessoas com mnos de 21 anos é "+qntI);
 		System.out.println("A quantidade de pessoas com mais de 50 anos é "+qntI2);
 	}
 }