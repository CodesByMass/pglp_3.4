/**
 * A dynamic robot moving on a 2D platform.
 *
 * @author Mass'
 *
 * @version 1.0
 */
public class Robot {

  private Position position;
  private Direction direction;

  /**
   * This constructor implicitly call the <i>addRobot()</i> method from the <i>AllRobots class</i>.
   * <br>
   *
   * @see AllRobots#addRobot(Robot)
   *
   * @param position The 2D coordinates of the robot
   * @param direction The direction pointed by the robot @see Direction
   */
  public Robot(Position position, Direction direction) {
    this.direction = direction;
    this.position = position;
    AllRobots.addRobot(this);
  }

  public Position getPosition() {
    return this.position;
  }

  public Direction getDirection() {
    return this.direction;
  }

  /**
   * The method moves the robot according to the direction where it points to.
   */
  public void avancer() {
    switch (this.direction) {
      case NORD:
        this.position.setY(1);
        break;
      case EST:
        this.position.setX(1);
        break;
      case OUEST:
        this.position.setX(-1);
        break;
      case SUD:
        this.position.setY(-1);
        break;
      default:
        break;
    }
  }

  /**
   * The method turns the robot based on its actual direction.
   */
  public void tourner() {
    switch (this.direction) {
      case NORD:
        this.direction = Direction.EST;
        break;
      case EST:
        this.direction = Direction.SUD;
        break;
      case SUD:
        this.direction = Direction.OUEST;
        break;
      case OUEST:
        this.direction = Direction.NORD;
        break;
      default:
        break;
    }
  }

}
