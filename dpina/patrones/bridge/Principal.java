package dpina.patrones.bridge;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vehicle vehicle1 = new Car(new Produce(), new Assemble());
		    vehicle1.manufacture();
		    Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
		    vehicle2.manufacture();
	}

}
