package com.kodilla.testing.weather.stub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures){
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public Double CalculateAverageTemperature (){
        Double avgTemp = 0.0;
        int a = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){
            avgTemp += temperature.getValue();
            a++;
        }
        avgTemp = avgTemp / a;
        return avgTemp;
    }

    public Double CalculateMedianTemperature (){
        Double medTemp;
        Double[] medianTempInArray = temperatures.getTemperatures().values().toArray(new Double[0]);
        Arrays.sort(medianTempInArray);

        if (medianTempInArray.length % 2 == 0){
            medTemp = (medianTempInArray[medianTempInArray.length/2] + medianTempInArray[(medianTempInArray.length/2)-1])/2.0;
        }else{
            medTemp = medianTempInArray[medianTempInArray.length/2];
        }

        return medTemp;
    }
}