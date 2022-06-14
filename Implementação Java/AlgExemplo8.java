import java.util.Scanner;

public class AlgExemplo8 {


  public static void main(String[] args){

  	Scanner ler = new Scanner (System.in);

  	float nota1, nota2, nota3, media;

  	System.out.println("Entre com a nota dos alunos");
  	nota1=ler.nextFloat();
  	nota2=ler.nextFloat();
  	nota3=ler.nextFloat();

  	media=(7+9+78)/3;

  	System.out.printf ("O valor da média é: %.2f", media);

  }
}



