package com.servicesImpl;

import com.entities.FlightSchedule;
import com.services.FlightScheduleServices;

import java.util.ArrayList;
import java.util.List;

public class FlightScheduleServicesImpl implements FlightScheduleServices {

    List<FlightSchedule> flightsList = new ArrayList<FlightSchedule>();

    public List<FlightSchedule> listFlights() {
        flightsList.add(new FlightSchedule(1, "Dallas", "Chicago", 120.00, "4:30", "7:00", "2h 30m"));
        flightsList.add(new FlightSchedule(2, "Memphis", "Dallas", 150.00, "5:30", "8:10", "2h 40m"));
        flightsList.add(new FlightSchedule(3, "Chicago", "Memphis", 180.00, "6:30", "9:20", "2h 50m"));

        flightsList.add(new FlightSchedule(1, "Dallas", "Chicago", 120.00, "4:30", "7:00", "2h 30m"));
        flightsList.add(new FlightSchedule(2, "Memphis", "Dallas", 150.00, "5:30", "8:10", "2h 40m"));
        flightsList.add(new FlightSchedule(3, "Chicago", "Memphis", 180.00, "6:30", "9:20", "2h 50m"));

        flightsList.add(new FlightSchedule(1, "Dallas", "Chicago", 120.00, "4:30", "7:00", "2h 30m"));
        flightsList.add(new FlightSchedule(2, "Memphis", "Dallas", 150.00, "5:30", "8:10", "2h 40m"));
        flightsList.add(new FlightSchedule(3, "Chicago", "Memphis", 180.00, "6:30", "9:20", "2h 50m"));

        flightsList.add(new FlightSchedule(1, "Dallas", "Chicago", 120.00, "4:30", "7:00", "2h 30m"));
        flightsList.add(new FlightSchedule(2, "Memphis", "Dallas", 150.00, "5:30", "8:10", "2h 40m"));
        flightsList.add(new FlightSchedule(3, "Chicago", "Memphis", 180.00, "6:30", "9:20", "2h 50m"));

        return flightsList;
    }

    public FlightSchedule findFlightSchedule(int flighId, List<FlightSchedule> listOfFlights) {

        for (FlightSchedule flight: listOfFlights) {
            if(flight.getId() == flighId)
                return flight;
        }
        return null;
    }

}