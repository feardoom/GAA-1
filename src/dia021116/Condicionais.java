package dia021116;

public class Condicionais {

	public Condicionais() {
//		comparadorSimples();
		comparadorMultiVariavel();
	}
	
	public void comparadorSimples(){
		// TODO Auto-generated constructor stub
		int num1 = 4;
		int num2 = 3;
		
		/*
		 * = -> Atribui��o
		 * == -> Compara��o ( true || false)
		 * <	-> Compara��o
		 * >	-> Compara��o
		 * !=	-> Compara��o
		 */
				
		if (num1 == num2) {
			System.out.println("Os numeros s�o iguais");
		} 
		else if (num1 < num2) {
			System.out.println("O num. 1 � menor que o num. 2");
		} else {
			System.out.println("O num. 1 � maior que o num. 2");
		}		
	}
	
	public void comparadorMultiVariavel() {
		int num1 = 5,
				num2 = 7,
				num3 = 3,
				num4 = 8;
		
		// se o numero1 maior que num2 e num3, mostra que � o maior
		/*
		 * & -> Concatenador
		 * && -> Comparador (e)
		 * || -> Comparador (ou)
		 */
		if (num1 > num2 &&  num1 > num3){
			System.out.println("O num. 1 � maior");
		}
		
		if (num1 > num2 &&  num1 > num3 && num1 > num4){
			System.out.println("O num. 1 � maior de todos");
		}
		
		/*
		 * !	-> Comutador de sinal/nega��o (verdadeiro para falso ou vice-versa)
		 * ()	-> Agrupam condi��es de verdade
		 */
		if (!(num2 > num3) || num1 > num4) {
			System.out.println("Ganha a equipa 1.");
		} else {
			System.out.println("Ganha a equipa 2.");
		}
	}

}
