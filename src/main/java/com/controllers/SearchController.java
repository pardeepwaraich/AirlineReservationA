package com.controllers;

import com.entities.FlightSchedule;
import com.services.FlightScheduleServices;
import com.servicesImpl.FlightScheduleServicesImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

@Controller
public class SearchController {

    @RequestMapping(value="/searchResults", method = RequestMethod.GET)// , method = RequestMethod.GET
    public ModelAndView redirect(HttpServletRequest request) {

        ModelAndView view = new ModelAndView();

        String source = request.getParameter("source");
        String destination = request.getParameter("destination");
        String ddate = request.getParameter("ddate");
        String noOfPassengers = request.getParameter("noOfPassengers");

        System.out.println("Source city: " + source);
        System.out.println("Destination city: " + destination);
        System.out.println("Departure date: " + ddate);
        System.out.println("Number of passengers: " + noOfPassengers);

        FlightScheduleServices flightScheduleServices = new FlightScheduleServicesImpl();

        List<FlightSchedule> listOfFlights = flightScheduleServices.listFlights();

        view.setViewName("searchResults");
        view.addObject("listOfFlights",listOfFlights);
        view.addObject("noOfPassengers",noOfPassengers);

        return view;
    }
}
