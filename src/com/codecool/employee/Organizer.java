package com.codecool.employee;

import com.codecool.Event;

import java.util.List;

public class Organizer extends Employee{
    private boolean canStart;

    public Organizer(String name) {
        super(name);
    }

    public boolean checkIfThereAreEnoughEmployees(List<Employee> employees){
        int countHelpers = 0;
        int countOrganizers = 0;
        int countChiefOrganizer = 0;
        for (Employee employee : employees) {
            if (employee instanceof Helper && countHelpers <= 10) {
                countHelpers++;
            }
            if (employee instanceof Organizer && countOrganizers <= 2){
                countOrganizers++;
            }
            if (employee instanceof ChiefOrganizer && countChiefOrganizer <= 1){
                countChiefOrganizer++;
            }
        }

        if (countHelpers < 10) {
            canStart = false;
            System.out.println("There aren't enough Helpers");
        }
        if (countChiefOrganizer == 0){
            canStart = false;
            System.out.println("There is no Chief Organizer");
        }
        if (countOrganizers < 2) {
            canStart = false;
            System.out.println("There aren't enough Organizers");
        }
        return true;
    }
}
