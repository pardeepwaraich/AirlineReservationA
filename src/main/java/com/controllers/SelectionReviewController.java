package com.controllers;

import com.entities.FlightSchedule;
import com.services.FlightScheduleServices;
import com.servicesImpl.FlightScheduleServicesImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SelectionReviewController {

    FlightScheduleServices flightScheduleServices = new FlightScheduleServicesImpl();

    @RequestMapping(value="/reviewSelection", method = RequestMethod.POST)// , method = RequestMethod.GET
    public ModelAndView redirect(@RequestParam int flightid, @RequestParam int noOfPassengers) {
        System.out.println("The flight's id is: " + flightid);

        ModelAndView view = new ModelAndView("reviewSelection");

        List<FlightSchedule> listOfFlights = flightScheduleServices.listFlights();

        FlightSchedule flightDetails = flightScheduleServices.findFlightSchedule(flightid, listOfFlights);

        view.addObject("flighDetails", flightDetails);
        view.addObject("noOfPassengers", noOfPassengers);

        return view;
    }
}
