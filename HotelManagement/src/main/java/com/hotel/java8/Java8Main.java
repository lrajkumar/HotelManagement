package com.hotel.java8;

import com.hotel.java8.weather.WeatherApi;
import com.hotel.java8.weather.WeatherData;

public class Java8Main {


    public static void main(String[] args) {

        //anonymous class
        WeatherApi api = new WeatherApi() {
            @Override
            public WeatherData getData() {
                WeatherData data = new WeatherData();
                data.setTemperature(30);
                data.setSnow(false);
                data.setMeasurement("C");

                return data;
            }
        };
        System.out.println(api.getData());

        WeatherApi api1 = () -> {
            WeatherData data = new WeatherData();
            data.setTemperature(30);
            data.setSnow(false);
            data.setMeasurement("C");

            return data;
        };

        System.out.println(api1.getData());

    }
}
