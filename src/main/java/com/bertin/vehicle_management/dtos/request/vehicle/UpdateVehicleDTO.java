package com.bertin.vehicle_management.dtos.request.vehicle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateVehicleDTO {

    private String manufacturer;
    private int manufacturedYear;
    private String model;
    private double price;
}
