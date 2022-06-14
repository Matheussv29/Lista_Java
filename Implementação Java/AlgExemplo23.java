import java.util.Scanner;
    public class AlgExemplo23{
   	public static void main(String[] args){

   		Scanner ler=new Scanner (System.in);

   		int A,B,C;

   		System.out.println("Entre com 3 números");
   		A=ler.nextInt();
   		B=ler.nextInt();
   		C=ler.nextInt();

   		if ( A==B && A==C && B==C){
   		 System.out.println("Equilátero");
   		}
   		else if (A==B){
   			System.out.println("Isóceles");
   		}
   			else if (B==C){
   			System.out.println("Isóceles");
   		}
   			else if (A==C){
   			System.out.println("Isóceles");
   		}
   			else {
   			System.out.println("Escaleno");
   			}
   	}
    }