package Problem1A;

public class Cylinder extends Shapes {
    double radius;
    double height;
    
    public Cylinder() {
    	this.radius = 0;
    	this.height = 0;
    }
    
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume() {
        return Pi * Math.pow(radius, 2) * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Pi * radius * (radius + height);
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
}

