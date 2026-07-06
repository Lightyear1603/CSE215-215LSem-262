package labwork07;

public class lw07cw02square {

	int side;
	
	public lw07cw02square() {
		side = 1;
	}
	public lw07cw02square(int side) {
		this.side=side;
	}
	
	
	public void getSide() {
		System.out.println("Side: "+side);
	}
	public int getArea() {
		return side*side;
	}
	
	public int getPerimeter() {
		return 4*side;
	}
	public double getDiag() {
		return side*Math.sqrt(2);
	}
	
}
