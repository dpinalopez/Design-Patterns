package dpina.patrones.adapter;

public class OracleSQL implements SQLAdapterTarget{

	@Override
	public void SELECT() {
		// TODO Auto-generated method stub
		System.out.println("realizo la accion select oracle");
	}

	@Override
	public void DELETE() {
		// TODO Auto-generated method stub
		System.out.println("realizo la accion delete oracle");
	}

	@Override
	public void INSERT() {
		// TODO Auto-generated method stub
		System.out.println("realizo la accion insert oracle");
	}

	@Override
	public void UPDATE() {
		// TODO Auto-generated method stub
		System.out.println("realizo la accion update oracle");
	}
}
