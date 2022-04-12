package com.kodilla.testing.weather.stub;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.awt.desktop.PreferencesEvent;
import java.util.*;

public class WeatherForecast {

    Temperatures temperatures;

    public WeatherForecast (Temperatures temperatures){
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast(){
        Map<String,Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperatures(){

        double averageTemp = 0.0;

        for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {
            averageTemp =  averageTemp + temperature.getValue();
        }

        averageTemp = averageTemp / temperatures.getTemperatures().size();

        return averageTemp;
    }

    public double medianTemperature(){

        double medianTemperature = 0.0;
        int positionOfMedian = 0;
        ArrayList<Double> sortedTemperatures = new ArrayList<>();

        for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {
            sortedTemperatures.add(temperature.getValue());
        }

        Collections.sort(sortedTemperatures);

        if (sortedTemperatures.size() % 2 != 0) {
            positionOfMedian = sortedTemperatures.size() / 2;
            medianTemperature = sortedTemperatures.get(positionOfMedian);
        } else {
            positionOfMedian = sortedTemperatures.size() / 2;
            System.out.println(sortedTemperatures.get(positionOfMedian));
            System.out.println(sortedTemperatures.get(positionOfMedian-1));
            medianTemperature = (sortedTemperatures.get(positionOfMedian - 1) + sortedTemperatures.get(positionOfMedian)) / 2;
        }

        return medianTemperature;
    }


}