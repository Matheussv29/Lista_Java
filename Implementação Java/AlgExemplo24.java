import java.util.Scanner;
    public class AlgExemplo24{
   	public static void main(String[] args){

   		Scanner ler=new Scanner (System.in);

   		int A, B, C;

   		System.out.println("Entre com 2 números para serem somados");
   		A=ler.nextInt();
   		B=ler.nextInt();

   		C=(A+B);

   		if (C>10){
   			System.out.println("C="+C);
   		}
   		else {
   			System.out.println();
   		}
   	}
   }