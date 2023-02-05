package com.hotel.java8.weather;

@FunctionalInterface //Single Abstract Method (SAM)
public interface WeatherApi {

    WeatherData getData();

}
