import java.util.Scanner;
 public class AlgExemplo20{
 public static void main (String[] args){

 	Scanner ler=new Scanner(System.in);

 	int A,B,C;

 	System.out.println("Entre com 2 números");
 	A=ler.nextInt();
 	B=ler.nextInt();

 	if (A==B){
 		C=(A+B);
 	}
 	else {
 		C=(A*B);
 	}
 	System.out.println(A+","+B+","+C);

 	 }
  }