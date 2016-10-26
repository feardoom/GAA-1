
public class ExercicioBalanco {
	int totalReceitas,
		totalDespesas;

	public ExercicioBalanco() {

		calcularReceitas();
		calcularDespesas();
		
		int balanco = totalReceitas - totalDespesas;
		
		System.out.println("Angariou " + totalReceitas + "€");
		System.out.println("Gastou " + totalDespesas + "€");
		System.out.println("O balanço é de " + balanco + "€");
	}
	
	public void calcularReceitas() {
		int quotas 			= 300,
				recBaile 	= 200,
				recBar		= 250;
		
		totalReceitas = quotas + recBaile + recBar;
	}
	
	public void calcularDespesas() {
		int agua 		= 80,
				luz 		= 60,
				telefone	= 70;
			
		totalDespesas = agua + luz + telefone;
	}

}
