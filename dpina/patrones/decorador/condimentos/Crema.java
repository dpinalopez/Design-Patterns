package dpina.patrones.decorador.condimentos;
import dpina.patrones.decorador.condimentos.CondimentoAbstracto;
import dpina.patrones.decorador.bebidas.Bebida;
public class Crema  extends CondimentoAbstracto{

	
	public Crema(Bebida bebida){
		this.bebida=bebida;
	}
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return bebida.getPrecio()+ 0.90;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return bebida.getDescripcion() + " con Crema";
	}

}
