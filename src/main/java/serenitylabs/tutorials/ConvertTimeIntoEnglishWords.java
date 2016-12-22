package serenitylabs.tutorials;

import java.time.LocalDateTime;

public class ConvertTimeIntoEnglishWords {
	public static void main(String args[]) {

		int totalMinutes;
		int hours;
		int hoursToDisplay;
		int minutesToDisplay;
		String minToDisplay = null;

		totalMinutes = (LocalDateTime.now().getHour() * 60) + LocalDateTime.now().getMinute();
		hours = totalMinutes / 60;
		hoursToDisplay = hours;

		if (hours > 12) {
			hoursToDisplay = hoursToDisplay - 12;
		}

		minutesToDisplay = totalMinutes - (hours * 60);

		if (minutesToDisplay == 0)
			minToDisplay = "00";
		else if (minutesToDisplay < 10)
			minToDisplay = "0" + minutesToDisplay;
		else
			minToDisplay = "" + minutesToDisplay;

		String displayValue = hoursToDisplay + ":" + minToDisplay;

		if (hours < 12)
			displayValue = displayValue + " AM";
		else
			displayValue = displayValue + " PM";

		System.out.println("current time  is " + displayValue);

	}

}
