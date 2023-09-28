
public class Date {
	private double integer;
	private double max = Integer.MIN_VALUE;
	private int counter;
	
	double average;

	public Date() {

	}

	public void satValuesToDate(double integer) {
		this.integer = integer;
		counter++; 
		maxInteger(integer);
		average += integer;
	}

	public double averageInteger() {
		return average / counter;
	}

	public double maxInteger(double integer) {
		if (this.integer > this.max) {
			this.max = integer;
		}
		return this.max;
	}

	public double getMaxInteger() {
		return max;
	}

	public double getAverageValue() {
		return averageInteger();
	}

	public String toString() {
		String answer = "Average Value: " + getAverageValue() + "\n" + "Max integer: " + getMaxInteger();
		return answer;
	}
}
