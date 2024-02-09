package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car("VW", 150, new Engine(345));
        Car car2 = new Car("VW", 150, new Engine(354));

        Car car3 = (Car) car1.clone();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car3.engine.engineNumber = 500;

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);


        Object o1 = String.valueOf(1);
        Object o2 = 123 + "T"; // String

        System.out.println(o1.getClass());
        System.out.println(o2.getClass());

        System.out.println(o1.getClass() == o2.getClass());

        Class<? extends Car> aClass = car1.getClass();

        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Class<?>[] interfaces = aClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }

        String s = "Yura";
        s = "YuraS";
        s.toLowerCase();

        Set<Car> set =  new HashSet<>();
        set.add(car1);
        set.add(car2);

        System.out.println(set);
        System.out.println(set.contains(car1) + " " + set.contains(car2));

        car2.model = "Toyota";

        System.out.println(set);
        System.out.println(set.contains(car1) + " " + set.contains(car2));

    }
}