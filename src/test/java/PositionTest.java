import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PositionTest {

	Position p  ;

	@Before
	public void setUp() {
		p = new Position(0,0);
	}

	@Test
	public void testSetX() {
		p.setX(1);
		assertEquals(p.x,1) ;
	}

	@Test
	public void testSetY() {
		p.setY(-1);
		assertEquals(p.y,-1) ;
	}

	@Test
	public void testEquals() {
		assertEquals(p, new Position(0,0)) ;
	}

}
