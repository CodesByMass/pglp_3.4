
public class Robot {

	private Position position ;
	private Direction direction ;

	public Robot(Position position ,Direction direction ){
		this.direction=direction;
		this.position=position ;
		AllRobots.addRobot(this);
	}


	public void avancer() {
		switch (this.direction) {
		case NORD:
			this.position.setY(1);; break ;
		case EST:
			this.position.setX(1);break ;
		case OUEST:
			this.position.setX(-1);break ;
		case SUD:
			this.position.setY(-1);break ;
		default: break ;
		}
	}

	public void tourner() {
		switch (this.direction) {
		case NORD:
			this.direction = Direction.EST ;
		case EST:
			this.direction = Direction.SUD ;
		case SUD:
			this.direction = Direction.OUEST ;
		case OUEST:
			this.direction = Direction.NORD;
		default: break;
		}
	}

}
