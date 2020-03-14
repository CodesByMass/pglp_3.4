import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author Mass'
 *
 * @version 1.0
 *
 */
public class AllRobotsTest {

	Robot r ;

	@Before
	public void setUp() {
		r = new Robot(new Position(1,1),Direction.NORD);
	}

	/**
	 * Each time a dynamic robot is created, it must be added to the listRobots.
	 */
	@Test
	public void testAddRobot() {
		// There is an implicit call to addRobot() when we create a robot
		Robot r = new Robot(new Position(3,2),Direction.EST);
		assertTrue(AllRobots.getListRobots().contains(r)) ;
	}

	/**
	 * All the dynamic robots must move based on their direction.
	 */
	@Test
	public void testAvancerTous() {
		AllRobots.avancerTous();
		assertTrue(r.getPosition().y == 2) ;
	}

}
