import java.util.Scanner;
public class AlgExemplo17{
	public static void main(String[] args){

		Scanner ler=new Scanner (System.in);

		int idade;

		System.out.println ("Entre com a idade do nadador");
		idade=ler.nextInt();

		if (idade>=5 && idade<=12){
			System.out.println("Infantil");
		}
		else if (idade>=13 && idade<=17){
		    System.out.println("Juvenil");
		}
		else if (idade>=18 && idade<=25){
		    System.out.println ("Profissional");
		}
		else{
			System.out.println("Demais Fora De Faixa");
		}


	}
}