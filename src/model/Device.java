package model;

import java.util.ArrayList;

public class Device {

    private String serial;
    private double consumption;
    private String description;
    private ArrayList<Event> events;

//Constructor 
    public Device(String serial, double consumption, String description) {
        this.serial = serial;
        this.consumption = consumption;
        this.description = description;

    }

//Getters and Setters
    public String getSerial() {
        return serial;
    }

    public double getConsumption() {
        return consumption;
    }

    public String getDescription() {
        return description;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addEvent(Event event) {
        if (this.events.add(event)) {
            System.out.println("Event added successfully.");
        } else {
            System.out.println("Failed to add event.");
        }
    }
}
