package com.controllers;

import com.entities.Flight;
import com.entities.Route;
import com.services.FlightServices;
import com.services.RouteServices;
import com.servicesImpl.FlightServicesImpl;
import com.servicesImpl.RouteServicesImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value="/admin")
public class AdminController {

    // To use all route services
    RouteServices route = new RouteServicesImpl();
    List<Route> listRoutes;

    // To use all flight services
    FlightServices flight = new FlightServicesImpl();
    List<Flight> listFlights;

    @RequestMapping(value={"/", ""}, method = RequestMethod.GET)
    public ModelAndView adminPage() {
        ModelAndView view = new ModelAndView();
        view.setViewName("admin");
        return view;
    }

    @RequestMapping(value="/addRoute")
    public ModelAndView addRoutePage(HttpServletRequest request,
                                     @RequestParam(value = "success", required = false) String success) {
        ModelAndView view = new ModelAndView();

        if (success != null)
            view.addObject("successMessage", "Route has been added successfully!");

        if ("POST".equalsIgnoreCase(request.getMethod()) && request.getParameter("submit") != null) {
            String source = request.getParameter("source");
            String destination = request.getParameter("destination");
//            System.out.println("Source:" + source);
//            System.out.println("Destination:" + destination);
            route.addRoute(new Route("1", source, destination));
        }
        view.setViewName("admin/Route/addRoute");
        return view;
    }

    @RequestMapping(value="/deleteRoute")// , method = RequestMethod.GET
    public ModelAndView deleteRoutePage() {
        ModelAndView view = new ModelAndView();
        view.setViewName("admin/Route/deleteRoute");
        return view;
    }

    @RequestMapping(value="/viewAllRoutes")// , method = RequestMethod.GET
    public ModelAndView viewAllRoutesPage() {
        ModelAndView view = new ModelAndView();

        listRoutes = route.listAllRoutes();

        view.addObject("listRoutes", listRoutes);
        view.setViewName("admin/Route/viewAllRoutes");
        return view;
    }

    @RequestMapping(value="/addFlight")
    public ModelAndView addFlightPage(HttpServletRequest request,
                                     @RequestParam(value = "success", required = false) String success) {
        ModelAndView view = new ModelAndView();

        if (success != null)
            view.addObject("successMessage", "Flight has been added successfully!");

        if ("POST".equalsIgnoreCase(request.getMethod()) && request.getParameter("submit") != null) {
            String manufacturer = request.getParameter("manufacturer");
            int capacity = Integer.parseInt(request.getParameter("capacity"));
//            System.out.println("Manufacturer:" + manufacturer);
//            System.out.println("Capacity:" + capacity);
            flight.addFlight(new Flight("1", manufacturer, capacity));
        }
        view.setViewName("admin/Flight/addFlight");
        return view;
    }

    @RequestMapping(value="/deleteFlight")
    public ModelAndView deleteFlightPage() {
        ModelAndView view = new ModelAndView();
        view.setViewName("admin/Flight/deleteFlight");
        return view;
    }

    @RequestMapping(value="/viewAllFlights")// , method = RequestMethod.GET
    public ModelAndView viewAllFlightsPage() {
        ModelAndView view = new ModelAndView();

        listFlights = flight.listAllFlights();

        view.addObject("listFlights", listFlights);
        view.setViewName("admin/Flight/viewAllFlights");
        return view;
    }
}
