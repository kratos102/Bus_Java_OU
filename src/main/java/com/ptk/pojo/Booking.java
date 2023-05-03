package com.ptk.pojo;

import java.math.BigDecimal;

public class Booking {
    private int id;
    private User user;
    private Trip trip;
    private int numTickets;
    private BigDecimal totalPrice;

    public Booking() {
    }

    public Booking(int id, User user, Trip trip, int numTickets, BigDecimal totalPrice) {
        this.id = id;
        this.user = user;
        this.trip = trip;
        this.numTickets = numTickets;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public int getNumTickets() {
        return numTickets;
    }

    public void setNumTickets(int numTickets) {
        this.numTickets = numTickets;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
