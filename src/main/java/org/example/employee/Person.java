package org.example.employee;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
class Person {
    private String firstName;
    private String lastName;
    private String dob;
    private int age;
    private Sex sex;
    private MarriageStatus marriageStatus;

    /**
     * Napisz metode ktora zmienia nazwisko z panienskiego na nazwisko po mezu pod warunkiem ze osoba jest kobieta
     * jak rowniez zmienia status na zamezna
     * w przypadku mezczyzny zmienia tylko status
     */
     public void marriage(String lastName){

     }
    /**
     * Sprawdza czy dana osoba ma dzisiaj urodziny, jezeli tak to wyswietli zyczenia Wszystkiego Najlepszego
     * Dla ulatiwenia data jest stringiem w formacie DD-MM-YYYY
     *
     */
    public void happyBirthday(){

    }

}
