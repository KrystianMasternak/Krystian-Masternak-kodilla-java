package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averangeTemperature() {
        Collection<Double> vauleList1 = temperatures.getTemperatures().values();
        double sum = 0;
        for (double temVauleList1 : vauleList1) {
            sum += temVauleList1;
        }
        double averange = sum / vauleList1.size();
        return averange;
    }


    public double medianTemperature() {
        Collection<Double> medianList = temperatures.getTemperatures().values();
        List<Double> list = new ArrayList<Double>(medianList);
        Collections.sort(list);
        double median;
        if (list.size() % 2 == 0)
            median = (list.get(list.size() / 2) + list.get(list.size()/2 - 1))/2;
        else
            median = list.get(list.size()/2);

        return median;
    }

}
