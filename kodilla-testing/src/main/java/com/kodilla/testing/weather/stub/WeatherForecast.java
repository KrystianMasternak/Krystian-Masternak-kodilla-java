package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public Map<String, Double> calculateForecast(){
        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averangeTemperature(){
        Collection<Double> vauleList1 = temperatures.getTemperatures().values();
        double sum = 0;
        for (double temVauleList1 : vauleList1) {
            sum += temVauleList1;
        }
        double averange = sum / vauleList1.size();
        return averange;
        }


    public double medianTemperature(){
       ArrayList<Double> vauleList2 = (ArrayList<Double>) temperatures.getTemperatures().values();
        Collections.sort(vauleList2);
        double median = 0;
        double averange = 0;

        if(vauleList2.size() % 2 == 0){
        averange = vauleList2.size()/2 + (vauleList2.size()/2)-1;
        median = averange/2;
        } else {
            median = vauleList2.size()/2;
        }
        return median;
    }
}
