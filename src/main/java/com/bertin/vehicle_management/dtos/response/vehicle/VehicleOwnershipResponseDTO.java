package com.bertin.vehicle_management.dtos.response.vehicle;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class VehicleOwnershipResponseDTO {
    private String ownerName;
    private String plateNumber;
    private double purchasePrice;
    private LocalDateTime transferDate;
}
