package com.servicesImpl;

import com.entities.Flight;
import com.entities.Route;
import com.services.FlightServices;

import java.util.ArrayList;
import java.util.List;

public class FlightServicesImpl implements FlightServices {

    List<Flight> flightList = new ArrayList();

    @Override
    public Flight addFlight(Flight flight) {
        return null;
    }

    @Override
    public List<Flight> listAllFlights() {

        flightList.add(new Flight("1", "Etihad", 100));
        flightList.add(new Flight("2", "Emirates", 100));
        flightList.add(new Flight("3", "American Airlines", 100));

        flightList.add(new Flight("4", "Etihad", 100));
        flightList.add(new Flight("5", "Emirates", 100));
        flightList.add(new Flight("6", "American Airlines", 100));

        flightList.add(new Flight("7", "Etihad", 100));
        flightList.add(new Flight("8", "Emirates", 100));
        flightList.add(new Flight("9", "American Airlines", 100));

        return flightList;
    }
}
