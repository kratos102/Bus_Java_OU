package com.ptk.pojo;

public class Route {
    private int id;
    private String name;
    private String description;
    private String startPoint;
    private String endPoint;

    public Route(int id, String name, String description, String startPoint, String endPoint) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Route(String name, String description, String startPoint, String endPoint) {
        this.name = name;
        this.description = description;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }
}
