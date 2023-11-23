package Problem5;

public class Time implements Comparable<Time> {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if ((hour >= 0 && hour < 24) && (minute >= 0 && minute < 60) && (second >= 0 && second < 60)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.print("Bruh, invalid time");
            System.exit(0);
        }
    }

    @Override
    public int compareTo(Time other) {
        if (this.hour != other.hour) {
            return this.hour - other.hour;
        } else if (this.minute != other.minute) {
            return this.minute - other.minute;
        } else {
            return this.second - other.second;
        }
    }

    public String toUniversalFormat() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandardFormat() {
        String period = (hour >= 12) ? "PM" : "AM";
        int standardHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
    }

    
    public void add(Time another) {
        this.second += another.second;
        this.minute += this.second / 60;
        this.second %= 60;
        this.minute += another.minute;
        this.hour += this.minute / 60;
        this.minute %= 60;
        this.hour += another.hour;
        this.hour %= 24;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

}

