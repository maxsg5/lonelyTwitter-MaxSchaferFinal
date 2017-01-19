package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Maxsg on 2017-01-18.
 */

//Happy Mood Class. CurrentMood class is superclass
public class HappyMood extends CurrentMood {

    public HappyMood() {
        mood = getHappyMood();
        this.date = getDate();
    }
    public String getHappyMood(){
        mood = " Happy :) ]";
        return mood;
    }
}
