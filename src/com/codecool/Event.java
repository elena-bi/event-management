package com.codecool;

import com.codecool.employee.Employee;
import com.codecool.employee.Organizer;
import com.codecool.employee.Helper;


import java.util.List;

public class Event {
    private List<Employee> employeesAvailable;
    private TypeOfEvent eventType;
    private Organizer organizer;
    private boolean isEverythingSet = false;
    private Time durationEvent;
    private Helper helper;
    private Time currentTime;


    public Event(TypeOfEvent eventType) {
        this.eventType = eventType;
    }


    public void addEmployee(Employee employee) {
        employeesAvailable.add(employee);
    }

    public List<Employee> getEmployeesAvailable(){
        return employeesAvailable;
    }

    public void canStartEvent(){
        if (organizer.checkIfThereAreEnoughEmployees(employeesAvailable)){
            isEverythingSet = true;
        }
    }

    private void setDurationEvent(TypeOfEvent eventType){
        Time durationEvent = new Time();
        if(eventType == TypeOfEvent.WEDDING){
            durationEvent.setHours(8);
        }
        if(eventType == TypeOfEvent.COCKTAIL_PARTY) {
            durationEvent.setHours(5);
        }
        if(eventType == TypeOfEvent.CONFERENCE){
            durationEvent.setHours(10);
        }
        this.durationEvent = durationEvent;
    }

    public void helpersOffers(){
        if (this.eventType == TypeOfEvent.COCKTAIL_PARTY && ((currentTime.getHours() * 60 % 5) == 0)){
            helper.offerCocktail();
        }
        if (this.eventType == TypeOfEvent.WEDDING && ((currentTime.getHours() * 60 % 10) == 0)){
            helper.offerCake();
        }
        if (this.eventType == TypeOfEvent.CONFERENCE && (currentTime.getHours() == 0)){
            helper.offerSnacks();
        }
    }


}
