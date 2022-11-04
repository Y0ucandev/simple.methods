package org.example.cars;

import lombok.Data;
import org.example.employee.Employee;

import java.util.Set;
@Data
public class Dealership {
    private Set<Car> carsInDealership;
    private double revenue;
    private double income;
    private double costs;
    private Set<Employee> employees;
    private double profitPercentage = 20;

    /**
     * Napisz metode ktora wylicza koszta ktore salon ponosi miesiecznie, na koszta skladaja sie wyplaty kazdego z pracownikow oraz
     * za kazdy samochod jaki dealer ma na stanie musi placic miesiecznie 3000 zl za postojowe,
     * dodatkowo kazdy samochod ma jakas cene, ta cena jest podwyzszona o 20% marze dealerska
     * Przy obliczeniach mozna opuscic cene auta o 20% marzy jaka ma dealer, ale reszta ceny to koszt
     * A ze kazdy samochod jest kupiony w kredycie kupieckim to trzeba miesiecznie zwiekszac jego koszt utrzymania o 1% jego wartosci
     * Czyli upraszczajac :
     * KOSZTA :
     * Pensje wszystkich pracownikow
     * Kazdy samochod to 3000 stalych kosztow miesiecznych
     * Kazdy samochod co miesiac generuje 1% kosztu swojej wartosci oprocz tych 3000 przy obliczeniach mozna opuscic o 20% marzy ktora wliczylismy juz w cene
     */
    public double monthlyCostsOfDealership(){
        return 0;
    }
    /**
     * Napisz metode ktora sprzeda samochod
     * TJ:
     * Zwiekszy profit firmy o wartosc sprzedazy pomniejszona o koszt samochodu czyli 80% jego wartosci
     * Pamietaj o usunieciu go z listy samochodow ktore mamy na placu
     */
    public void sellCar(Car car){

    }

    /**
     * napisz metode ktora oblicza zysk miesieczny dealera
     * Czyli roznice miedzy  przychodem a kosztami
     *
     */
    public double countRevenue(){
        return 0;
    }


}
