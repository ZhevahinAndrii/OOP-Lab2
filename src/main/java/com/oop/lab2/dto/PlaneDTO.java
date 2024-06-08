package com.oop.lab2.dto;

import lombok.Data;

@Data
public class PlaneDTO {
    private String Id;
    private String model;
    private int passengerSeats;
    private double maxLuggage;
    private int maxFlightInMins;
}