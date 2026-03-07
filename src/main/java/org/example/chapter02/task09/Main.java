package org.example.chapter02.task09;

record TimeOfDay(int hour, int minute){
    public TimeOfDay{
        if (minute < 0 || minute >= 60){
            int extraH = minute / 60;
            minute = minute % 60;
            if (minute < 0){
                minute += 60;
                extraH--;
            }
            hour += extraH;
        }
        if (hour < 0){
            hour = 24 - (Math.abs(hour) % 24);
        } else {
            hour = hour % 24;
        }
    }
}

public class Main {
}
