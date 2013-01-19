package dpina.patrones.adapter;

public abstract interface SQLAdapterTarget {

	
	abstract public void SELECT();
	abstract public void DELETE();
	abstract public void INSERT();
	abstract public void UPDATE();
}
