import java.util.Scanner;
 public class AlgExemplo19{
 public static void main(String[] args){

 Scanner ler = new Scanner (System.in);

 int idade;

 System.out.println("Entre com a idade");
 idade=ler.nextInt();


 if (idade<=16){
    System.out.println("não eleitor");
}
 else if (idade>=18 && idade<=65){
    System.out.println("eleitor obrigatório");
}
 else {
 	System.out.println("eleitor facultativo");
 }

  }
 }