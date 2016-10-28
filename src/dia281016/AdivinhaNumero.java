package dia281016;

import java.util.Random;

/*
 * Random : V
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
