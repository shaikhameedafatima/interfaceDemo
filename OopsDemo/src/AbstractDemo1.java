abstract class Shape
{
    String objectname = "";
    Shape(String name)
    {
        this.objectname = name;
    }
    public void moveTo(int x,int y)
    {
        System.out.println(this.objectname + "  "+"has been moved to" +"x= "+x+" and y="+y);
    }
//abstract methods which will be implemented by its subcls(es)
    abstract public double area();
    abstract public void draw();
}
class Rectangle extends Shape
{
    int length, width;
    //constructor
        Rectangle(int length, int width, String name)
        {
            super(name);
            this.length = length;
            this.width = width;
        }
        public void draw()
        {
            System.out.println("Rectangle has been draw");
        }
        public double area() {
            return (double)(length*width);
        }
}
        class Circle extends Shape
        {
            double pi = 3.14;
             int radius;
        
        Circle(int radius, String name)
        { 
            super(name);
            this.radius = radius;
        }
        public void draw()
        {
            System.out.println("Circle has been drawn");
        }
        public double area()
        {
            return (double)((pi*radius*radius)/2);
        }
}
public class AbstractDemo1 {

 

    public static void main(String[] args) {
//creating the object of rectangle cls and using shape cls refernce//
        
        Shape rect = new Rectangle(2,3, "Rectangle");
        rect.draw();
        System.out.println("Area of rectangle:" +rect.area());
            rect.moveTo(1, 2);
            System.out.println(" ");
         //creating the objects of circle class
             Shape circle = new Circle(2, "Circle");
             circle.draw();
             System.out.println("Area of circle :" +circle.area());
             circle.moveTo(2, 4);
    

 

    }

 

}