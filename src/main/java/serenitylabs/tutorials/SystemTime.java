package serenitylabs.tutorials;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static java.lang.String.format;

class SystemTime {

	public String getMinutesToDisplayAsString(int minutesToDisplayInt) {
		String minToDisplayStr;
		if (minutesToDisplayInt == 0)
			minToDisplayStr = "00";
		else if (minutesToDisplayInt < 10)
			minToDisplayStr = "0" + minutesToDisplayInt;
		else
			minToDisplayStr = "" + minutesToDisplayInt;
		return minToDisplayStr;
	}

	public int getMinutesToDisplayAsInt(int totalMinutes, int hours) {
		return totalMinutes - (hours * 60);
	}

	public int getHoursToDisplay(int hours, int hoursToDisplay) {
		if (hours > 12) {
			hoursToDisplay = hoursToDisplay - 12;
		}
		return hoursToDisplay;
	}

	public int getTotalNumberOfHours(int totalMinutes) {
		return totalMinutes / 60;
	}

	public int getTotalMinutesInCurrentTime() {
		return (LocalDateTime.now().getHour() * 60) + LocalDateTime.now().getMinute();
	}

}
