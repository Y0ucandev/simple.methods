package org.example;

import org.example.cars.Car;
import org.example.cars.Dealership;
import org.example.employee.Employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Employee salesMan = Employee.builder()
                .salary(3800)
                .hourlyRate(23)
                .hoursWorkedCurrentMonth(168)
                .positionDescription("Sprzedawca")
                .currentlyEmployed(true)
                .build();
        Employee cleaner = Employee.builder()
                .positionDescription("Sprzataczka")
                .salary(2300)
                .currentlyEmployed(true)
                .hourlyRate(20)
                .hoursWorkedCurrentMonth(168)
                .build();
        Employee manager = Employee.builder()
                .positionDescription("Manager")
                .salary(10000)
                .hourlyRate(100)
                .hoursWorkedCurrentMonth(168)
                .currentlyEmployed(true)
                .build();
        List<Employee> employees = new ArrayList<>();
        employees.add(salesMan);
        employees.add(manager);
        employees.add(cleaner);
        Dealership dealership = new Dealership();
        List<Car> cars = Car.buildCarList();
        dealership.setCarsInDealership(new HashSet<>(cars));

    }
}
