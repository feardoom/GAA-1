package dia281016;

import java.util.Random;

/*
 * Random : Valor aleat�rio
 * if : express�o condicional
 */
public class AdivinhaNumero {
	int escondido;
	final int VALORMAX = 5;
	
	public AdivinhaNumero() {
		Random r = new Random();
		
		escondido = r.nextInt(VALORMAX);
		
		tentarAdivinhar();
	}
	
	public void tentarAdivinhar() {
		
	}

}
