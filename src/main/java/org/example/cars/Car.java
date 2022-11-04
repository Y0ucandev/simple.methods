package org.example.cars;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
public class Car {
    private String brand;
    private String model;
    private int hp;
    private double from0to100Time;
    private boolean isDamaged = false;
    private double price;
    private boolean reservation;

    public Car(String brand, String model, int hp, double from0to100Time) {
        this.brand = brand;
        this.model = model;
        this.hp = hp;
        this.from0to100Time = from0to100Time;
    }


    /**
     * Napisz metode ktora posortuje liste od najszybszego samochodu do najwolniejszeog pod wzgledem HP
     * @param cars
     * @return
     */
    public List<Car> fromFastestToSlowest(List<Car> cars) {
        return Collections.emptyList();
    }

    /**
     * napisz metode ktora posortuej liste od najszybszego samochodu do najwolniejszego pod wzgledem HP i czasu do 100
     * @return
     */
    public List<Car> fromFastestByHPAnd0100Time(List<Car> cars){
        return Collections.emptyList();
    }

    public static List<Car> buildCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "M3", 500, 4.5));
        cars.add(new Car("Nissan", "GTR NISMO", 655, 2.9));
        cars.add(new Car("Ferrari", "Berlinetta", 599, 3.9));
        cars.add(new Car("Porsche", "GT3", 555, 4.2));
        return cars;
    }

    /**
     * Oznacz dwa najszybsze samochody jako uszkodzone
     */
    public void damaged(List<Car> cars){

    }

}
