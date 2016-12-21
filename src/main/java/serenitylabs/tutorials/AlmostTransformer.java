package serenitylabs.tutorials;


import serenitylabs.tutorials.interfaces.ConversationalTimeFormatter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pawpawar on 12/22/2016.
 */
public class AlmostTransformer implements ConversationalTimeFormatter {
    @Override

    public String convertTimeToText(Integer hour, Integer minutes){

        return "It is almost "+ HOUR_O_CLOCKS.get((hour%12) + 1);
    }
    private static Map<Integer,String> HOUR_O_CLOCKS=new HashMap<>();
    static{
        HOUR_O_CLOCKS.put(0,"midnight");
        HOUR_O_CLOCKS.put(1,"one o'clock");
        HOUR_O_CLOCKS.put(2,"two o'clock");
        HOUR_O_CLOCKS.put(3,"three o'clock");
        HOUR_O_CLOCKS.put(4,"four o'clock");
        HOUR_O_CLOCKS.put(5,"five o'clock");
        HOUR_O_CLOCKS.put(6,"six o'clock");
        HOUR_O_CLOCKS.put(7,"seven o'clock");
        HOUR_O_CLOCKS.put(8,"eight o'clock");
        HOUR_O_CLOCKS.put(9,"nine o'clock");
        HOUR_O_CLOCKS.put(10,"ten o'clock");
        HOUR_O_CLOCKS.put(11,"eleven o'clock");
        HOUR_O_CLOCKS.put(12,"noon");
    }
}
