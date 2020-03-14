
public class RobotStatique {

	private Position position ;
	private Direction direction ;

	public RobotStatique(Position position, Direction direction) {
		this.position = position ;
		this.direction = direction ;
	}

	public Position getPosition() {
		return this.position ;
	}

	public Direction getDirection() {
		return this.direction ;
	}

	public void avancer() {
		throw new UnsupportedOperationException() ;
	}

}
