package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        Engine engine1 = new Engine();
        engine1.setCapacity(1000);
        car1.setEngine(engine1);

        Car car2 = new Car();
        Engine engine2 = new Engine();
        engine2.setCapacity(1500);
        car2.setEngine(engine2);

        Car car3 = new Car();
        Engine engine3 = new Engine();
        engine3.setCapacity(1800);
        car3.setEngine(engine3);

        Car car4 = new Car();
        Engine engine4 = new Engine();
        engine4.setCapacity(2000);
        car4.setEngine(engine4);

        Car car5 = new Car();
        Engine engine5 = new Engine();
        engine5.setCapacity(1500);
        car5.setEngine(engine5);

        Map<Integer, List<Car>> result = createMap(car1, car2, car3, car4, car5, car3);
        System.out.println(result);
    }

    public static Map<Integer, List<Car>> createMap(Car... cars) {
        Map<Integer, List<Car>> map = new HashMap<>();

        for (Car car: cars) {
            Integer key = car.getEngine().getCapacity();
            map.putIfAbsent(key, new ArrayList<>());
            List<Car> value = map.get(key);
            value.add(car);
            map.put(key, value);
        }
        return map;
    }
}
