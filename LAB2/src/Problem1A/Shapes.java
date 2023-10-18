package Problem1A;

public abstract class Shapes {
	
	public final double Pi = 3.14;
	
	public abstract double volume();
	public abstract double surfaceArea();
	
	public String getType() {
        return this.getClass().getSimpleName();
    }
}
