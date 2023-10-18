package Problem1A;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<Shapes> shapes = new Vector<>();
		shapes.add(new Cylinder(5, 10));
        shapes.add(new Sphere(10));
        shapes.add(new Cube(5));
        
        for (Shapes shape : shapes) {
            System.out.println(shape.getType() + " Volume: " + shape.volume());
            System.out.println(shape.getType() + " Surface Area: " + shape.surfaceArea());
        }
	}
}
 