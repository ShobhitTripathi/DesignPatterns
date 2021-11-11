package com.DesignPatterns.ObserverPattern;

public class ForecastDisplay implements Observer, DisplayElement {
    Subject weatherData;

    public ForecastDisplay (Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update (float temp, float humidity,float pressure) {
        display();
    }

    public void display() {
        System.out.println("ForecastDisplay: weather will get better");

    }
}
