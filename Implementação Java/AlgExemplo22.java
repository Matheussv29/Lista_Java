import java.util.Scanner;
    public class AlgExemplo22{
   	public static void main(String[] args){

   		Scanner ler=new Scanner (System.in);

   		int A,B;

   		System.out.println("Entre com 2 números diferentes");
   		A=ler.nextInt();
   		B=ler.nextInt();

   		if (A<B){
   			System.out.println(B+","+A);
   		}
   		else {
   			System.out.println(A+","+B);
   		}
   	}
   }