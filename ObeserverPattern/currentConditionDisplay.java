package com.DesignPatterns.ObserverPattern;

public class currentConditionDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;
    Subject weatherData;

    public currentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update (float temp, float humidity,float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("currentConditionDisplay: temp:" +temp + " humidity:" + humidity + " pressure:" +pressure);

    }
}
