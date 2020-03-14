import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class RobotStatiqueTest {
	RobotStatique r ;

	@Before
	public void setUp() {
		r = new RobotStatique(new Position(1,1), Direction.NORD) ;
	}

	@Test
	public void testGetPosition() {
		Position p = new Position(1,1) ;
		assertEquals(r.getPosition(),p) ;
	}

	@Test
	public void testGetDirection() {
		assertEquals(r.getDirection(),Direction.NORD);
	}

	@Test(expected=UnsupportedOperationException.class)
	public void testAvancer() {
		r.avancer();
		fail() ;
	}

}
