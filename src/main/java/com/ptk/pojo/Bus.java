package com.ptk.pojo;

public class Bus {
    private int id;
    private String name;
    private int numSeats;

    public Bus(int id, String name, int numSeats) {
        this.id = id;
        this.name = name;
        this.numSeats = numSeats;
    }

    public Bus(String name, int numSeats) {
        this.name = name;
        this.numSeats = numSeats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }
}
