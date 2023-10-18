package Problem1A;

public class Sphere extends Shapes {
    double radius;

    public Sphere() {
    	this.radius = 0;
    }
    
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Pi * Math.pow(radius, 3);
    }

    @Override
    public double surfaceArea() {
        return 4 * Pi * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
}

