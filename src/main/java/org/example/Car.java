package org.example;

import java.util.Objects;

public class Car extends Object implements Cloneable {

    String model;
    Integer power;
    Engine engine;

    public Car(String model, Integer power, Engine engine) {
        this.model = model;
        this.power = power;
        this.engine = engine;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Car(this.model, this.power, new Engine(this.engine.engineNumber));
    }

    void doNothing() {

    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Car car = (Car) o;
//
//        if (!Objects.equals(model, car.model)) return false;
//        return Objects.equals(power, car.power);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (!Objects.equals(model, car.model)) return false;
        if (!Objects.equals(power, car.power)) return false;
        return Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, power, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", engine=" + engine +
                '}';
    }
}
