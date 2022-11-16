package studio8;

import java.util.Objects;

public class Time {
	
	private int hour;
	private int minute;
	private boolean twelveHour;
	
	/**
	 * Creates a time object.
	 * @param hour The hour (ranging from 0 to 23)
	 * @param minute The minute (ranging from 0 to 59)
	 * @param twelveHour Whether the time should be displayed as 12 hour or 24 hour. 
	 */
	
	public Time(int hour, int minute, boolean twelveHour) {
		this.hour = hour;
		this.minute = minute;
		this.twelveHour = twelveHour;
	}
	
	public String toString() {
		String time = "";
		if (twelveHour == true) {
			if (this.hour < 13) {
				time = this.hour + ":" + this.minute;
			}
			else {
				time = (this.hour - 12) + ":" + this.minute;
			}
		} 
		else {
			time = this.hour + ":" + this.minute;
		}
		
		return time;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public static void main(String[] args) {
 
    	
    }

}