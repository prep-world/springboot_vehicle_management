package com.bertin.vehicle_management.services;

import com.bertin.vehicle_management.dtos.request.vehicle.TransferVehicleDTO;
import com.bertin.vehicle_management.dtos.response.vehicle.VehicleOwnershipResponseDTO;

import java.util.List;

public interface IOwnershipRecordService {

    void transferVehicleOwnership(TransferVehicleDTO dto);

    List<VehicleOwnershipResponseDTO> getOwnershipHistoryByChassis(String chassisNumber);

    List<VehicleOwnershipResponseDTO> getOwnershipHistoryByPlate(String plateNumber);

}
