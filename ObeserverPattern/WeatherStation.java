package com.DesignPatterns.ObserverPattern;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        currentConditionDisplay currentDisplay = new currentConditionDisplay(weatherData);
        ForecastDisplay display = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(10,20,30);

    }
}
