package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Office office = new Office();
        office.addPersonal(new Personal("Никита", LocalDate.of(1991,07,03), 35000));
        office.addPersonal(new Personal("Гоша", LocalDate.of(1992,12,04), 35000));
        office.addPersonal(new Personal("Даня", LocalDate.of(2013,07,16), 35000));
        office.addPersonal(new Supervisor("Петя",LocalDate.of(1991,06,11),50000));
        System.out.println(office.toString());
        Personal.salaryUp(2000,office);
        System.out.println(office.toString());

    }
}