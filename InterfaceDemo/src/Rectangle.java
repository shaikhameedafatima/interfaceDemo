
public class Rectangle implements Shape {
	private double width;
	private double heigth;


	public Rectangle(double width, double heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw a rectangle");

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.heigth*this.width;
	}

}
