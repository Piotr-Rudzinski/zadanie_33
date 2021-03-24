package com.company;

public class Car {
    private String name = "default";
    private Engine engine = new Engine();
    public int maxSpeed;
    //private Color color = Color.Black;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
        engine = null;
    }

    public void printName() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setEnginePower(Integer power) {
        engine.setPower(power);
    }
    public Integer getEnginePower() {
        return engine.getPower();
    }

    public void setMaxSpeed(Integer in){
        this.maxSpeed = in;
    }

    public  void  setFasterCar(Car car1, Car car2) {
        if (car1.getMaxSpeed() > car2.getMaxSpeed()) {
            car1.name = "faster car";
        } else if (car1.getMaxSpeed() < car2.getMaxSpeed()) {
            car2.name = "faster car";
        }
    }
}

