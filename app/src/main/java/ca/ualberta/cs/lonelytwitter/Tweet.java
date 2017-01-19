package ca.ualberta.cs.lonelytwitter;
import java.util.Date;

/**
 * Created by Maxsg on 2017-01-18.
 */

public class Tweet {
    public Date date;
    public String message;
    CurrentMood mood = new CurrentMood();



    public Tweet(Date date, String message){
        this.date = date;
        this.message = message;
        //this.mood = mood;

    }

//    public Tweet(String message){
//        this.message = message;
//        this.date = new Date();//current time and date
//
//    }
    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }
    public String getMessage(){
        return message;
    }

//    public void setMessage(String message){
//        if(message.length() > 144) {
//
//
//        }
    }

