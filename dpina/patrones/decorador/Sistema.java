package dpina.patrones.decorador;

import dpina.patrones.decorador.bebidas.Bebida;
import dpina.patrones.decorador.bebidas.Cafe;
import dpina.patrones.decorador.condimentos.Crema;
import dpina.patrones.decorador.condimentos.Leche;

public class Sistema {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bebida bebida = new Cafe();
		bebida = new Leche(bebida);
		bebida = new Crema(bebida);
		System.out.println(bebida.getDescripcion());
		
	}

}
