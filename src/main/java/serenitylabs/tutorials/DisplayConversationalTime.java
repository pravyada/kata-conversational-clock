package serenitylabs.tutorials;

public class DisplayConversationalTime {
	public static void main(String args[]) {

		int totalMinutes;
		int totalHours;
		int hoursToDisplay;
		int minutesAsInt;
		String minutesAsStr = null;
		
		SystemTime systemTime = new SystemTime();
		totalMinutes = systemTime.getTotalMinutesInCurrentTime();
		totalHours = systemTime.getTotalNumberOfHours(totalMinutes);
		hoursToDisplay = totalHours;

		hoursToDisplay = systemTime.getHoursToDisplay(totalHours, hoursToDisplay);

		minutesAsInt = systemTime.getMinutesToDisplayAsInt(totalMinutes, totalHours);

		minutesAsStr = systemTime.getMinutesToDisplayAsString(minutesAsInt);
		
		
		String displayValue = new ConvertTimeIntoTextMessage().getTextToDisplay(hoursToDisplay,minutesAsStr,minutesAsInt);

		displayValue = checkForAmOrPm(totalHours, displayValue);

		System.out.println(displayValue);

	}

	private static String checkForAmOrPm(int totalHours, String displayValue) {
		if (totalHours < 12)
			displayValue = displayValue + " AM";
		else
			displayValue = displayValue + " PM";
		return displayValue;
	}

	
}
