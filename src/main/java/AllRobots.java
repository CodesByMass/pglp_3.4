import java.util.ArrayList;

/**
 * Holds all the robots in the game, the main class that move the dynamic robots.
 *
 * @author Mass'
 *
 * @version 1.0
 *
 */
public class AllRobots {

  /**
   * Contains the dynamic robots.
   */
  private static final ArrayList<Robot> listRobots = new ArrayList<Robot>();

  /**
   * Function called implicitly every time a dynamic robot is created.
   *
   * @see Robot#Robot(Position, Direction)
   *
   * @param r The Robot instantiated
   */
  public static void addRobot(Robot r) {
    listRobots.add(r);
  }

  /**
   * Returns the list containing dynamic robots.
   *
   * @return The list of all the dynamic robots.
   */
  public static ArrayList<Robot> getListRobots() {
    return listRobots;
  }

  /**
   * Moves all the dynamic robots according to their respective direction.
   */
  public static void avancerTous() {

    for (Robot r : listRobots) {
      r.avancer();
    }
  }

  public static void main(String[] args) {
    new Robot(new Position(0, 0), Direction.SUD);
    new Robot(new Position(3, 1), Direction.EST);
    new Robot(new Position(1, 2), Direction.NORD);
    RobotStatique rs = new RobotStatique(new Position(0, 5), Direction.SUD);
    try {
      rs.avancer();
    } catch (UnsupportedOperationException e) {
      System.out.println("Un robot statique ne peut pas avancer");
    }
    avancerTous();
  }
}


