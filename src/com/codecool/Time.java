package com.codecool;

import java.util.Random;

public class Time {
    private int hours;
    private int minutes;

    public Time(){
        Random randomNumber = new Random();
        this.hours = randomNumber.nextInt(24);
        this.minutes = randomNumber.nextInt(59);
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }


}
