package com.entities;

public class Flight {

    private String flight_id, manufacturer;
    private int capacity;

    // Constructors
    public Flight() {
        // Blank constructor
    }
    public Flight(String flight_id, String manufacturer, int capacity) {
        this.flight_id = flight_id;
        this.manufacturer = manufacturer;
        this.capacity = capacity;
    }

    // Getters
    public String getFlight_id() {
        return flight_id;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public int getCapacity() {
        return capacity;
    }

    // Setters
    public void setFlight_id(String flight_id) {
        this.flight_id = flight_id;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

