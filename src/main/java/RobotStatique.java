/**
 * a Static Robot, ain't able to move.
 *
 * @author Mass'
 *
 * @version 1.0
 *
 */
public class RobotStatique {

  private Position position;
  private Direction direction;

  public RobotStatique(Position position, Direction direction) {
    this.position = position;
    this.direction = direction;
  }

  public Position getPosition() {
    return this.position;
  }

  public Direction getDirection() {
    return this.direction;
  }

  /**
   * This method throws an exception because a static robot can't move.
   *
   * @exception UnsupportedOperationException when the method is called
   */
  public void avancer() {
    throw new UnsupportedOperationException();
  }

}
