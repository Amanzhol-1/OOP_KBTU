package Problem2;

public class StarTriangle {
	public int width;
	String answer = "";
	
	public StarTriangle(int width) {
		this.width = width;
		
	}
	
	public String MakeStarTriangle() {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j <= i; j++) { //sh
				answer += "[*]";
			}
			answer += "\n";
		}
		return answer;
	}
	
	public String toString() {
		return answer;
	}
	
}