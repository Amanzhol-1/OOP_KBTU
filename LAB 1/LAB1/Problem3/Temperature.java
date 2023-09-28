package Problem3;

public class Temperature {
	public double temperature;
	public String scale;
	
	
	public Temperature(double temperature) {
		this.temperature = temperature;
		scale = "C";
	}
	public Temperature(String scale) {
		this.scale = scale;
		temperature = 0;
	}
	public Temperature(double temperature, String scale) {
		this.temperature = temperature;
		this.scale = scale;
	}
	public Temperature() {
		scale = "C";
		temperature = 0;
	}
	
	
	public void Celsius() {
		if (scale != "C") {
			double degreesC = 5 * (temperature - 32) / 9;
			this.temperature = degreesC;
		}
		this.scale = "C";
	}
	
	public void Fahrenheit(){ 
		if (scale != "F") {
			double degreesF = (9 * (temperature / 5)) + 32;
			this.temperature = degreesF;
		}
		this.scale = "F";
	}
	
	
	public void setTemperature(double temperature) {
		this.temperature = temperature; 
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public void setTemperatureAndScale(double temperature, String scale) {
		this.temperature = temperature;
		this.scale = scale;
	}
	
	public double getTemperature() {
		return this.temperature;
	}
	public String getScale() {
		return this.scale;
	}
	
	public String toString() {
		String answer = getTemperature() + " " + getScale();
		return answer; 
	}

}
