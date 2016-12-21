package serenitylabs.tutorials;

import serenitylabs.tutorials.interfaces.ConversationalTimeFormatter;
import serenitylabs.tutorials.interfaces.TimeProvider;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pawpawar on 12/22/2016.
 */
public class ConversationalClockDisplayer {
    private final TimeProvider timeProvider;

    public ConversationalClockDisplayer (TimeProvider timeProvider){this.timeProvider=timeProvider;}
    public ConversationalClockDisplayer(){this(()-> LocalTime.now());}

    private static Map<Integer,ConversationalTimeFormatter> TIME_FORMAT_STRATEGY=new HashMap<>();
    static{
        TIME_FORMAT_STRATEGY.put(15, new QuarterPastTransformer());
        TIME_FORMAT_STRATEGY.put(30, new HalfPastTransformer());
        TIME_FORMAT_STRATEGY.put(45, new QuarteToTransformer());
        TIME_FORMAT_STRATEGY.put(00, new DefaultTransformer());
        TIME_FORMAT_STRATEGY.put(56, new AlmostTransformer());
        TIME_FORMAT_STRATEGY.put(57, new AlmostTransformer());
        TIME_FORMAT_STRATEGY.put(58, new AlmostTransformer());
        TIME_FORMAT_STRATEGY.put(59, new AlmostTransformer());
        TIME_FORMAT_STRATEGY.put(01, new Just_After());
        TIME_FORMAT_STRATEGY.put(02, new Just_After());
        TIME_FORMAT_STRATEGY.put(03, new Just_After());
        TIME_FORMAT_STRATEGY.put(04, new Just_After());
    }

    public String showTime(){
        Integer localTimeHour=timeProvider.getLocalTime().getHour();
        Integer localTimeMinute=timeProvider.getLocalTime().getMinute();
        return getTimeStrategy(localTimeHour,localTimeMinute);
    }

    private String getTimeStrategy(Integer localTimeHour, Integer localTimeMinute){
        return TIME_FORMAT_STRATEGY.get(localTimeMinute).transform(localTimeHour,localTimeMinute);
    }
}
