package com.entities;

public class Route {

    private String route_id, source, destination;

    // Constructors
    public Route() {
        // Blank constructor
    }
    public Route(String route_id, String source, String destination) {
        this.route_id = route_id;
        this.source = source;
        this.destination = destination;
    }

    // Getters
    public String getRoute_id() {
        return route_id;
    }
    public String getSource() {
        return source;
    }
    public String getDestination() {
        return destination;
    }

    // Setters
    public void setRoute_id(String route_id) {
        this.route_id = route_id;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
}
