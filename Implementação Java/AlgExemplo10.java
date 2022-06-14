import java.util.Scanner;

public class AlgExemplo10{


  public static void main(String[] args){

  	Scanner ler = new Scanner (System.in);

  	double dist_percorrida, vol_combustivel, consumo_med;

  	System.out.println("Entre com a distancia percorrida e o volume de combustivel");
  	dist_percorrida=ler.nextDouble();
  	vol_combustivel=ler.nextDouble();

  	consumo_med=dist_percorrida/vol_combustivel;



    System.out.println("O valor do consumo médio do veículo é " + consumo_med);
}
}