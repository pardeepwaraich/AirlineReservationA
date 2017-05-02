package com.services;

import com.entities.Route;

import java.util.List;

public interface RouteServices {

    public Route addRoute(Route route);
    public List<Route> listAllRoutes();
}
