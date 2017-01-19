package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by Maxsg on 2017-01-18.
 */

//class for the Meh mood ignore the class name I know it's not the same as MehMood
public class CurrentMood {
    public Date date;
    public String mood;


    public CurrentMood() {
        mood = getMood();
        this.date = getDate();
    }

    public String getMood(){
        mood = " Meh :| ]";
        return mood;
    }
    public Date getDate(){
        return date;
    }
}
