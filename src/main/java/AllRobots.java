import java.util.HashSet;

public class AllRobots {

	private final static HashSet<Robot> listRobots = new HashSet<Robot>();

	public static void addRobot(Robot r) {
		listRobots.add(r) ;
	}

	public void avancerTous() {

		for (Robot r :listRobots) {
			r.avancer();
		}
	}

	public static void main( String[] args )
	{

	}
}


