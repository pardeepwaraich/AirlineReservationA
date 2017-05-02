package com.entities;

public class Reservation {

    private String reservationId;
    private String flightScheduleId;
    private int noOfPassengers;
    private double totalPrice;

    // Constructors
    public Reservation() {
        // Blank constructor
    }
    public Reservation(String reservationId, String flightScheduleId, int noOfPassengers, double totalPrice) {
        this.reservationId = reservationId;
        this.flightScheduleId = flightScheduleId;
        this.noOfPassengers = noOfPassengers;
        this.totalPrice = totalPrice;
    }

    // Getters
    public String getReservationId() {
        return reservationId;
    }
    public String getFlightScheduleId() {
        return flightScheduleId;
    }
    public int getNoOfPassengers() {
        return noOfPassengers;
    }
    public double getTotalPrice() {
        return totalPrice;
    }

    // Setters
    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }
    public void setFlightScheduleId(String flightScheduleId) {
        this.flightScheduleId = flightScheduleId;
    }
    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
