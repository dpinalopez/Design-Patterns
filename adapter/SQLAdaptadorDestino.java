package dpina.patrones.adapter;

public class SQLAdaptadorDestino implements SQLAdapterTarget {

	private SQLDestino sqldestino;
	
	public SQLAdaptadorDestino(SQLDestino sqldestino){
	
		this.sqldestino = sqldestino;
	}
	
	@Override
	public void SELECT() {
		// TODO Auto-generated method stub
		sqldestino.buscarRegistro();
	}

	@Override
	public void DELETE() {
		// TODO Auto-generated method stub
		sqldestino.borrarRegistro();
	}

	@Override
	public void INSERT() {
		// TODO Auto-generated method stub
		sqldestino.insertarRegistro();
	}

	@Override
	public void UPDATE() {
		// TODO Auto-generated method stub
		sqldestino.modificarRegistro();
	}

}
