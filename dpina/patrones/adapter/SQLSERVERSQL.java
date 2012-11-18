package dpina.patrones.adapter;

public class SQLSERVERSQL implements SQLAdapterTarget{

	@Override
	public void SELECT() {
		// TODO Auto-generated method stub
		System.out.println("realizo la accion select sqlserver");
	}

	@Override
	public void DELETE() {
		// TODO Auto-generated method stub
		System.out.println("realizo la accion delete sqlserver");
	}

	@Override
	public void INSERT() {
		// TODO Auto-generated method stub
		System.out.println("realizo la accion insert sqlserver");
	}

	@Override
	public void UPDATE() {
		// TODO Auto-generated method stub
		System.out.println("realizo la accion update sqlserver");
	}

}
