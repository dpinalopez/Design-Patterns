package dpina.patrones.Builder;

public class OldRobotBuilder implements RobotBuilder{

	private Robot robot;
	
	public OldRobotBuilder(){
		this.robot = new Robot();
	}
	
	@Override
	public void buildRobotHead() {
		// TODO Auto-generated method stub
		robot.setRobotHead("Tin head");
	}

	@Override
	public void buildRobotTorso() {
		// TODO Auto-generated method stub
		robot.setRobotTorso("Tin Torso");
	}

	@Override
	public void buildRobotArms() {
		// TODO Auto-generated method stub
		robot.setRobotArms("BlowTorch arms");
	}

	@Override
	public void buildRobotLegs() {
		// TODO Auto-generated method stub
		robot.setRobotLegs("Rollar skates");
	}
	
	public Robot getRobot(){
		return this.robot;
	}
}
