// import java.util.Scanner;
// public class AlgExemplo51
// {
// public static void main(String args[])
// {
// float nota1, nota2, nota3, somaNotasAluno, somaNotaClasse=0,
// mediaClasse=0;
// int quantAprovados=0, quantReprovados=0, quantAlunos=0;
// String nomeAluno = "p";
// Scanner leitura = new Scanner(System.in);
// while (!nomeAluno.equals("FIM"))
// {
// leitura = new Scanner(System.in);
// System.out.println("Entre com o nome do aluno e digite <FIM> para
// finalizar");
// nomeAluno = leitura.nextLine();
// if (!"FIM".equals(nomeAluno))
// {
// System.out.println("Entre com as tr�s notas do aluno");
// nota1 = leitura.nextFloat();
// nota2 = leitura.nextFloat();
// nota3 = leitura.nextFloat();
// somaNotasAluno = nota1 + nota2 + nota3;
// somaNotaClasse += somaNotasAluno;
// quantAlunos ++;
// if (somaNotasAluno>=60){

// quantAprovados +=1;
// else
// quantReprovados +=1;
// }
// }
// if(quantAlunos>0)
// {
// mediaClasse = somaNotaClasse / quantAlunos;
// System.out.println("A m�dia da turma �: " + mediaClasse);
// System.out.printf("A m�dia da turma �: %.1f \n", mediaClasse);
// System.out.println("Quantidade de alunos aprovados �: " +
// quantAprovados);
// System.out.println("Quantidade de alunos reprovados �: " +
// quantReprovados);
// }
// }
// }