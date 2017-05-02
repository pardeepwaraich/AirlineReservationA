package com.services;

import com.entities.Flight;

import java.util.List;

public interface FlightServices {

    public Flight addFlight(Flight flight);
    public List<Flight> listAllFlights();
}
