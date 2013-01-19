package dpina.patrones.adapter;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OracleSQL sqloracle = new OracleSQL();
		sqloracle.SELECT();
		sqloracle.INSERT();
		sqloracle.DELETE();
		sqloracle.UPDATE();
		
		SQLSERVERSQL sqlsqlserver = new SQLSERVERSQL();
		sqlsqlserver.SELECT();
		sqlsqlserver.INSERT();
		sqlsqlserver.DELETE();
		sqlsqlserver.UPDATE();
		
		SQLPARADOX sqlparadox = new SQLPARADOX();
		SQLAdaptadorDestino sqlparadoxadaptado = new SQLAdaptadorDestino(sqlparadox);
		sqlparadoxadaptado.SELECT(); //ni me entero de que en el fondo el interface es diferente
	}
}
