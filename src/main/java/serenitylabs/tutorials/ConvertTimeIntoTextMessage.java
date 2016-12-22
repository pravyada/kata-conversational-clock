package serenitylabs.tutorials;

import java.util.HashMap;
import java.util.Map;

public class ConvertTimeIntoTextMessage {
	private static  Map<Integer,String>hoursInWord = new HashMap<Integer,String>();
	{
		hoursInWord.put(0,"00");
		hoursInWord.put(1,"One");
		hoursInWord.put(2,"Two");
		hoursInWord.put(3,"Three");
		hoursInWord.put(4,"Four");
		hoursInWord.put(5,"Five");
		hoursInWord.put(6,"Six");
		hoursInWord.put(7,"Seven");
		hoursInWord.put(8,"Eight");
		hoursInWord.put(9,"Nine");
		hoursInWord.put(10,"Ten");
		hoursInWord.put(11,"Eleven");
		hoursInWord.put(12,"Twelve");
	}
	private static  Map<String,String>minutesInWords = new HashMap<String,String>();
	{
		minutesInWords.put("00","00");
		minutesInWords.put("01","One");
		minutesInWords.put("02","Two");
		minutesInWords.put("03","Three");
		minutesInWords.put("04","Four");
		minutesInWords.put("05","Five");
		minutesInWords.put("06","Six");
		minutesInWords.put("07","Seven");
		minutesInWords.put("08","Eight");
		minutesInWords.put("09","Nine");
		minutesInWords.put("10","Ten");
		minutesInWords.put("11","Eleven");
		minutesInWords.put("12","Twelve");
		minutesInWords.put("13","Thirteen");
		minutesInWords.put("14","Fourteen");
		minutesInWords.put("15","Fifteen");
		minutesInWords.put("16","Sixteen");
		minutesInWords.put("17","Seventeen");
		minutesInWords.put("18","Eighteen");
		minutesInWords.put("19","Ninteen");
		minutesInWords.put("20","Twenty");
		minutesInWords.put("21","Twenty One");
		minutesInWords.put("22","Twenty Two");
		minutesInWords.put("23","Twenty Three");
		minutesInWords.put("24","Twenty Four");
		minutesInWords.put("25","Twenty Five");
		minutesInWords.put("26","Twenty Six");
		minutesInWords.put("27","Twenty Seven");
		minutesInWords.put("28","Twenty Eight");
		minutesInWords.put("29","Twenty Nine");
		minutesInWords.put("30","Thirty");
		minutesInWords.put("31","Thirty One");
		minutesInWords.put("32","Thirty Two");
		minutesInWords.put("33","Thirty Three");
		minutesInWords.put("34","Thirty Four");
		minutesInWords.put("35","Thirty Five");
		minutesInWords.put("36","Thirty Six");
		minutesInWords.put("37","Thirty Seven");
		minutesInWords.put("38","Thirty Eight");
		minutesInWords.put("39","Thirty Nine");
		minutesInWords.put("40","Fourty");
		minutesInWords.put("41","Fourty One");
		minutesInWords.put("42","Fourty Two");
		minutesInWords.put("43","Fourty Three ");
		minutesInWords.put("44","Fourty Four");
		minutesInWords.put("45","Fourty Five");
		minutesInWords.put("46","Fourty Six");
		minutesInWords.put("47","Fourty Seven");
		minutesInWords.put("48","Fourty Eight");
		minutesInWords.put("49","Fourty Nine");
		minutesInWords.put("50","Fifty");
		minutesInWords.put("51","Fifty One");
		minutesInWords.put("52","Fifty Two");
		minutesInWords.put("53","Fifty Three");
		minutesInWords.put("54","Fifty Four");
		minutesInWords.put("55","Fifty Five");
		minutesInWords.put("56","Fifty Six");
		minutesInWords.put("57","Fifty Seven");
		minutesInWords.put("58","Fifty Eight");
		minutesInWords.put("59","Fifty Nine");
		minutesInWords.put("60","Sixty");
		
	}

	public String getTextToDisplay(int hoursToDisplay, String minToDisplay, int minutesInInteger) {
		// TODO Auto-generated method stub

		String timeToDisplay = null;
		int minutesInAnHour=60;
		
		if(hoursToDisplay==12 && minutesInInteger==0)
			timeToDisplay="it's Noon";
		else if(hoursToDisplay==1)
			timeToDisplay="it's 1 O'clock";
		else if(hoursToDisplay==0)
			timeToDisplay="it's midnight";
		else if (minutesInInteger >= 0 && minutesInInteger <= 4)
			timeToDisplay = "It's just after "+hoursToDisplay;
		else if (minutesInInteger >= 5 && minutesInInteger <= 29)
			timeToDisplay = "It's " + minToDisplay + " past " + hoursToDisplay;
		else if (minutesInInteger >= 30 && minutesInInteger <= 44)
			timeToDisplay = "It's half past " + hoursToDisplay;
		else if (minutesInInteger >= 45 && minutesInInteger <= 49)
			timeToDisplay = "It's quarter to " + (hoursToDisplay + 1);
		else if (minutesInInteger >= 50 && minutesInInteger <= 57)
			timeToDisplay = "It's" + (minutesInAnHour - minutesInInteger) + " to " + (hoursToDisplay + 1);
		else if (minutesInInteger >= 58 && minutesInInteger <= 59)
			timeToDisplay = "It's almost " + (hoursToDisplay + 1);
		else
			timeToDisplay = String.valueOf(hoursToDisplay);

		return timeToDisplay;
	}
	

}
