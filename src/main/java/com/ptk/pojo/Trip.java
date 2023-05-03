package com.ptk.pojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Trip {
    private int id;
    private Bus bus;
    private Route route;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private BigDecimal price;

    public Trip(int id, Bus bus, Route route, LocalDateTime departureTime, LocalDateTime arrivalTime,
            BigDecimal price) {
        this.id = id;
        this.bus = bus;
        this.route = route;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
