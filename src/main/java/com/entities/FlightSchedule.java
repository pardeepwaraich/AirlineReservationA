package com.entities;

import javax.persistence.Entity;

public class FlightSchedule {
    private int id;
    private String source, destination, dept_time, arrival_time, journey_duration;
    private double price;

    // Constructors
    public FlightSchedule() {
        // blank constructor
    }
    public FlightSchedule(int id, String source, String destination, double price, String dept_time, String arrival_time, String journey_duration) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.price = price;
        this.dept_time = dept_time;
        this.arrival_time = arrival_time;
        this.journey_duration = journey_duration;
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getSource() {
        return source;
    }
    public String getDestination() {
        return destination;
    }
    public double getPrice() {
        return price;
    }
    public String getDept_time() {
        return dept_time;
    }
    public String getArrival_time() {
        return arrival_time;
    }
    public String getJourney_duration() {
        return journey_duration;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDept_time(String dept_time) {
        this.dept_time = dept_time;
    }
    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }
    public void setJourney_duration(String journey_duration) {
        this.journey_duration = journey_duration;
    }
}
