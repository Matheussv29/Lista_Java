import java.util.Scanner;

public class AlgExemplo9{


  public static void main(String[] args){

  	Scanner ler = new Scanner (System.in);

  	double altura, base, area;

  	System.out.println("Entre com um numero para altura e um para base do trinagulo");
  	altura=ler.nextDouble();
  	base=ler.nextDouble();

  	area=(base*altura)/2;

    System.out.println("O valor da área do triangulo é " + area);
}
}