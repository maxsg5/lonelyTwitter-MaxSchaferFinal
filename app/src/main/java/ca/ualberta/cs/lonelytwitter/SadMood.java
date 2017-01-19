package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Maxsg on 2017-01-18.
 */

//Sad Mood Class. CurrentMood class is superclass
public class SadMood extends CurrentMood {
    public SadMood() {
        mood = getSadMood();
        this.date = getDate();
    }
    public String getSadMood(){
        mood = " Sad :( ]";
        return mood;
    }
}
