package studio8;

import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
	/**
	 * Creates a date object.
	 * @param month The month as an integer.
	 * @param day The day as an integer.
	 * @param year The year as an integer.
	 * @param holiday Whether this date is a holiday.
	 */
	
	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}
	
	public String toString() {
		String result = "";
		result = month + "/" + day + "/" + year;
		if (this.holiday == true) {
			result += " Holiday";
		}
		else {
			result += " Not a Holiday";
		}
		
		return result;
	}

    public static void main(String[] args) {
    }

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
