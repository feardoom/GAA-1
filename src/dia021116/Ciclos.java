package dia021116;

public class Ciclos {

	public Ciclos() {
		// TODO Auto-generated constructor stub
//		fazerEnquanto();
//		enquanto();
		de_para();
	}
	
	public void enquanto() {
		int i = 2;
		String msg = "All you need is love";
		
		while (i <= 4) {
			System.out.println(msg);
			i++;
		}		
	}
	
	public void fazerEnquanto() {
		int i = 2;
		String msg = "All you need is love";
		
		do {
			System.out.println(msg);
			i++;
			
		} while (i <= 4);		
	}
	
	public void de_para() {
		String msg = "All you need is love";
		
		/*
		 * for
		 * int i= 0; -> inicializa a variável de controlo
		 * i < 4;	-> Testa a variável de controlo
		 * i++;		-> executa acção
		 */
		for (int i=0; i < 4; i++) {
			System.out.println(msg);
		}
	}
}
