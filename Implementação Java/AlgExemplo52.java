import java.util.Scanner;
	public class AlgExemplo52
	{
		public static void main(String args[]){

		Scanner ler=new Scanner(System.in);

		char genero = ' ';

		float mediaIdade = 0 ,
			  mediaPeso = 0,
			  peso = 0 ,
			  somaPeso = 0 ;

		int idade = 0 ,
			totalHomens = 0 ,
			totalMulheres = 0 ,
			 	somaIdade = 0;

	    while(idade != -1){
			System.out.println("Entre com a idade ou digite <-1> para finalizar");
			idade=ler.nextInt();

			if(idade != -1 ){
				System.out.println("Digite o peso :");
				peso=ler.nextFloat();

				System.out.println("Digite o genero (M ou F)");
				genero = ler.next().charAt(0);

				if(genero == 'M' || genero == 'm'){
					totalHomens++;
					somaIdade = somaIdade + idade ;
				}
				if(genero == 'F' || genero == 'f'){

					totalMulheres++;
					somaPeso = somaPeso + peso ;
				}
			}
	    }
		if(totalHomens != 0)
	    	mediaIdade = somaIdade / totalHomens ;

	    if(totalMulheres != 0 )
			mediaPeso = somaPeso / totalMulheres ;

		System.out.println("O total de homens é : "+totalHomens );
		System.out.println("O total de mulheres é : "+totalMulheres);

		System.out.println("Média das idades dos homens é : "+mediaIdade );
		System.out.println("Média dos pesos das mulheres é : "+mediaPeso);

	}
}
