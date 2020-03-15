import java.util.Objects;

/**
 * Define the position of the robot on the 2D platform.
 *
 * @author Mass'
 *
 * @version 1.0
 *
 */
public class Position {

  int x;
  int y;

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Sets a new x coordinate.
   *
   * @param x The new position in the x-axis
   */
  public void setX(int x) {
    this.x += x;
  }

  /**
   * Sets a new y coordinate.
   *
   * @param y The new position in the y-axis
   */
  public void setY(int y) {
    this.y += y;
  }

  /**
   * The hash function.
   *
   * @see #equals(Object)
   */
  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  /**
   * Redefine the Equals function.
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Position other = (Position) obj;
    return Objects.equals(this.x, other.x) && Objects.equals(this.x, this.y);
  }


}
