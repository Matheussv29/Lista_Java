import java.util.Scanner;
public class AlgExemplo43 {

    public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);

		double nota1, nota2, nota3, notaTotal, somaNota=0, mediaNota;
		int i, qntAprov=0, qntReprov=0;
		String nome;

		for (i=0;i<10;i++)
		{
			System.out.print("Entre com seu nome ");
			nome=ler.next();

			ler=new Scanner(System.in);

			System.out.print("Entre com as três notas ");
			nota1=ler.nextDouble();
			nota2=ler.nextDouble();
			nota3=ler.nextDouble();
			notaTotal=nota1+nota2+nota3;
			somaNota+=notaTotal;

			if (notaTotal>=60)
				qntAprov ++;
			else
				qntReprov ++;
		}
		mediaNota=(float) somaNota/1;

		System.out.printf("A média das notas da turma é: %.2f\n", mediaNota);
		System.out.println(qntAprov);
		System.out.println(qntReprov);
	}
}