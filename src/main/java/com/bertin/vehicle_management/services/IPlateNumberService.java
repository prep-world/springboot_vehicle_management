package com.bertin.vehicle_management.services;

import com.bertin.vehicle_management.models.PlateNumber;

import java.util.UUID;

public interface IPlateNumberService {
    PlateNumber generateAndAssignPlateNumberToOwner(UUID ownerId);
}
