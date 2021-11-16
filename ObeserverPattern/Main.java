package com.DesignPatterns.ObserverPattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WeatherData weatherData = new WeatherData();

        currentConditionDisplay currentDisplay = new currentConditionDisplay(weatherData);
        ForecastDisplay display = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(10,20,30);
    }
}
