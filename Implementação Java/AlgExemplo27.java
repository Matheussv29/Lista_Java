import java.util.Scanner;
 public class AlgExemplo27{
 	public static void main(String[] args){

 		Scanner ler=new Scanner (System.in);

 		int idade;

 		String nome;

 		System.out.println("Entre com nome e idade do paciente");
 		nome=ler.nextLine();
 		idade=ler.nextInt();

 		if (idade<=12){
 			System.out.println(nome+" de "+idade+" anos será atendido(a) por um pediatra");
 		}
 		else if (idade>12 && idade<=59){
 				System.out.println(nome+" de "+idade+" anos será atendido(a) por um clínico geral");
 		}
 		else {
 				System.out.println(nome+" de "+idade+" anos será atendido(a) por um geriatra");
 		}


 	}
 }