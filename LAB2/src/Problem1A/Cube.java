package Problem1A;

public class Cube extends Shapes {
    double sideLength;
    
    public Cube() {
    	this.sideLength = 0;
    }
    
    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double volume() {
        return Math.pow(sideLength, 3);
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    public double getSideLength() {
        return sideLength;
    }
}
