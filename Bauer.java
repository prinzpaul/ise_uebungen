package schach;

public class Bauer extends Figur{

	Bauer(Farbe farbe, int x, int y) {
		super(farbe, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

}