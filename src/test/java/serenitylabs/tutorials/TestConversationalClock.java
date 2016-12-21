package serenitylabs.tutorials;

import com.googlecode.zohhak.api.Coercion;
import com.googlecode.zohhak.api.TestWith;
import com.googlecode.zohhak.api.runners.ZohhakRunner;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(ZohhakRunner.class)
public class TestConversationalClock {

    @TestWith({
            "01,00, it one o'clock",
    })
    public void should_tell_the_time_on_the_hour(ConversationalClock clock, String expectedTime) throws Exception {
        assertThat(clock.currentTime()).isEqualTo(expectedTime);
    }

    ConversationalClockDisplayer conversationalClockDisplayer;
    String conversationalTime;

    @TestWith(
            {
                "12,00, It is noon",
                "1,00,It is one o'clock",
                    "11,00,It is eleven o'clock"
            }
    )

    public void should_display_noon_in_conversational_time(int hour,int minutes,String expectedTime)throws Exception{
        convertTimeToText(hour,minutes,expectedTime);
    }

    private void convertTimeToText(int hour, int minutes, String expectedTime) {
    conversationalClockDisplayer = new ConversationalClockDisplayer(()-> LocalTime.of(hour,minutes));
        conversationalTime = conversationalClockDisplayer.displayTime();


        MatcherAssert.assertThat(conversationalTime, Matchers.is(expectedTime));
    }

    @TestWith(
            {
                "12,30, It is half past twelve",
                    "1,30, It is half past one"
            }
    )

    public void should_display_past_thirty_in_conversational_time(int hour,int minutes,String expectedTime)throws Exception{
        convertTimeToText(hour,minutes,expectedTime);
    }



    @TestWith(
            {
                "13,58, It is almost two o'clock"
            }
    )

    public void should_display_almost_in_conversational_time(int hour,int minutes,String expectedTime)throws Exception{

        convertTimeToText(hour,minutes,expectedTime);

    }



    @TestWith(
            {
                    "4,20, It is four oclocke twenty minutes in the morning"
            }
    )

    public void should_display_just_after_in_conversational_time(int hour,int minutes,String expectedTime)throws Exception{

        convertTimeToText(hour,minutes,expectedTime);

    }


    @TestWith(
            {
                    "12,15, It is quarter past twelve",
                    "12:45, It is quarter to one"
            }
    )

    public void should_display_quarters_in_conversational_time(int hour,int minutes,String expectedTime)throws Exception{
        convertTimeToText(hour,minutes,expectedTime);
    }
}
