package dpina.patrones.Builder;


public class TestRobotBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RobotBuilder oldstyleRobot = new OldRobotBuilder();
		RobotEngineer robotEngineer = new RobotEngineer(oldstyleRobot);
		robotEngineer.makeRobot();
		Robot firstRobot = robotEngineer.getRobot();	
		System.out.println("Robot built");
		System.out.println("Robot head type" + firstRobot.getRobotHead());
		System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());	
		System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());
		System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());
	}
}
