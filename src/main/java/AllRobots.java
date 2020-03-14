import java.util.ArrayList;

public class AllRobots {

	private final static ArrayList<Robot> listRobots = new ArrayList<Robot>();

	public static void addRobot(Robot r) {
		listRobots.add(r) ;
	}

	public static ArrayList<Robot> getListRobots() {
		return listRobots ;
	}

	public static void avancerTous() {

		for (Robot r :listRobots) {
			r.avancer();
		}
	}

	public static void main( String[] args )
	{
		new Robot(new Position(0,0), Direction.SUD) ;
		new Robot(new Position(3,1), Direction.EST) ;
		new Robot(new Position(1,2), Direction.NORD) ;
		new RobotStatique(new Position(0,5), Direction.SUD) ;
		avancerTous() ;
	}
}


