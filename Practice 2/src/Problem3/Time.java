package Problem3;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		if ((hour >= 0 && hour < 24) && (minute >= 0 && minute < 60) && (second >= 0 && second < 60)) {
			this.hour = hour;
            this.minute = minute;
            this.second = second;
		}
		else {
			System.out.print("Bruh, invalid time");
			System.exit(0);
		}
	}
	
	public String toUniversalFormat() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
	
	public String toStandardFormat() {
        String period = (hour >= 12) ? "PM" : "AM";
        int standardHour = (hour > 12) ? hour - 12 : hour;
        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
    }
	
	public void add(Time anoth) {
        int Hour = this.hour + anoth.hour;
        int Minute = this.minute + anoth.minute;
        int Second = this.second + anoth.second;
        if (Second >= 60) {
            Second -= 60;
            Minute++;
        }
        if (Minute >= 60) {
            Minute -= 60;
            Hour++;
        }
        if (Hour >= 24) {
            Hour -= 24;
        }
        this.hour = Hour;
        this.minute = Minute;
        this.second = Second;
    }
}
