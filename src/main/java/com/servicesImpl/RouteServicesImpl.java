package com.servicesImpl;

import com.entities.Route;
import com.services.RouteServices;

import java.util.ArrayList;
import java.util.List;

public class RouteServicesImpl implements RouteServices {

    List<Route> routeList = new ArrayList();

    @Override
    public Route addRoute(Route route) {
        return null;
    }

    @Override
    public List<Route> listAllRoutes() {
        routeList.add(new Route("1", "Dallas", "Chicago"));
        routeList.add(new Route("2", "Memphis", "Chicago"));
        routeList.add(new Route("3", "Chicago", "Dallas"));

        routeList.add(new Route("4", "Dallas", "Chicago"));
        routeList.add(new Route("5", "Memphis", "Chicago"));
        routeList.add(new Route("6", "Chicago", "Dallas"));

        routeList.add(new Route("7", "Dallas", "Chicago"));
        routeList.add(new Route("8", "Memphis", "Chicago"));
        routeList.add(new Route("9", "Chicago", "Dallas"));

        return routeList;
    }
}
