package org.example.employee;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
public class Employee {
    private double salary;
    private double hourlyRate;
    private double hoursWorkedCurrentMonth;
    private String positionDescription;
    private boolean currentlyEmployed;

    /**
     * Metoda daje podwyzke, czyli podnosi pensje pracownika o X procent;
     * @param raisePercentage
     */
    public void giveARaise(double raisePercentage){

    }

    /**
     * Metoda ta ma zwolnic pracownika, co oznacza ustawienie null lub 0 w polach zgodnie z tym co jest mozliwe
     * Jak rowniez zmienia nazwe stanowiska na powod zwolnienia oraz ustawia flage currentlyEmployed na false
     * jak rowniez
     */
    public void dismiss(String reason){

    }

    /**
     * Metoda ta daje awans pracownikowi, co wiaze sie z podwyzka w wysokosci X procent oraz zmiana opisu stanowiska
     */
    public void promoteEmployee(String newJobDescription,double raisePercentage){

    }
}
