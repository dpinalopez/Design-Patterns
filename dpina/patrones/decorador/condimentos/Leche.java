package dpina.patrones.decorador.condimentos;
import dpina.patrones.decorador.condimentos.CondimentoAbstracto;
import dpina.patrones.decorador.bebidas.Bebida;
public class Leche extends CondimentoAbstracto {

	
	public Leche(Bebida bebida){
		this.bebida = bebida;
	}
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return bebida.getPrecio() + 0.36;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return bebida.getDescripcion() + " con Leche";
	}

}
