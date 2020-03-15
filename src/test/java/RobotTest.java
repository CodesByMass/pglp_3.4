import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Mass'
 *
 * @version 1.0
 *
 */
public class RobotTest {

  Robot r;

  @Before
  public void setUp() {
    r = new Robot(new Position(1, 1), Direction.NORD);
  }

  @Test
  public void testGetPosition() {
    Position p = new Position(1, 1);
    assertEquals(r.getPosition(), p);
  }

  @Test
  public void testGetDirection() {
    assertEquals(r.getDirection(), Direction.NORD);
  }

  /**
   * The Robot should move north if his direction is North(NORD)
   */
  @Test
  public void testAvancer() {
    r.avancer();
    assertEquals(r.getPosition().y, 2);
  }

  /**
   * An object must turn a quarter turn.
   */
  @Test
  public void testTourner() {
    r.tourner();
    assertEquals(r.getDirection(), Direction.EST);
  }

}
