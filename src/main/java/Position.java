import java.util.Objects;

public class Position {

	int x ;
	int y ;

	public Position(int x, int y ) {
		this.x = x ;
		this.y = y ;
	}

	public void setX(int x)
	{
		this.x += x ;
	}

	public void setY(int y)
	{
		this.y += y ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		return Objects.equals(this.x, other.x) && Objects.equals(this.x, this.y) ;
	}


}
