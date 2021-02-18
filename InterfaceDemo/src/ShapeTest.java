
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//programming for interfaces not implementation
		Shape shape=new Circle(10);//upcasting
		shape.draw();
		Circle c=new Circle(10);
		//System.out.println("Radius="+shape.getRadius());
		System.out.println("Area="+shape.getArea());
		//switching from one implementation to another
		shape=new Rectangle(10,10);
		shape.draw();
		System.out.println("Area="+shape.getArea());

	}

}
