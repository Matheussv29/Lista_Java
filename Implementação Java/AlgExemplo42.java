import java.util.Scanner;
public class AlgExemplo42 {

    public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);

		int i,idade,qntAluno70=0, qntAluno20=0;
		float nota, mediaTurma=0, somaNota=0;

		for (i=0;i<=29;i++)
		{
			System.out.println("");
			System.out.println("Entre com a nota do aluno");
    		nota=ler.nextFloat();

			System.out.println("Entre com a idade do aluno");
			idade=ler.nextInt();

			somaNota += nota;

			if (nota>70)
			{
				qntAluno70++;
			}
			if (idade>20)
			{
 				qntAluno20++;
			}
		}
		mediaTurma=(float)somaNota/i;

		System.out.printf("A média das notas da turma é: %.2f\n", mediaTurma);
		System.out.println("A quantidade de alunos com nota acima de 70 é:"+ qntAluno70);
		System.out.println("A quantidade de alunos com idade acima de 20 anos é: "+ qntAluno20);
	}
}