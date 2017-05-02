package com.services;

import com.entities.FlightSchedule;

import java.util.List;

public interface FlightScheduleServices {

    public List<FlightSchedule> listFlights();
    public FlightSchedule findFlightSchedule(int flighId, List<FlightSchedule> listOfFlights);

}
