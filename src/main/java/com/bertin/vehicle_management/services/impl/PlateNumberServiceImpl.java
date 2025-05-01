package com.bertin.vehicle_management.services.impl;

import com.bertin.vehicle_management.enums.EPlateStatus;
import com.bertin.vehicle_management.exceptions.NotFoundException;
import com.bertin.vehicle_management.models.Owner;
import com.bertin.vehicle_management.models.PlateNumber;
import com.bertin.vehicle_management.repositories.IOwnerRepository;
import com.bertin.vehicle_management.repositories.IPlateNumberRepository;
import com.bertin.vehicle_management.services.IPlateNumberService;
import com.bertin.vehicle_management.utils.helpers.PlateNumberGenerator;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PlateNumberServiceImpl implements IPlateNumberService {

    private final IPlateNumberRepository plateNumberRepository;
    private final IOwnerRepository ownerRepository;
    private final PlateNumberGenerator plateNumberGenerator;

    @Override
    @Transactional
    public PlateNumber generateAndAssignPlateNumberToOwner(UUID ownerId) {
        Owner owner = ownerRepository.findById(ownerId)
                .orElseThrow(() -> new NotFoundException("Owner not found with ID: " + ownerId));

        String plateValue = plateNumberGenerator.generateNextPlateNumber();

        PlateNumber plateNumber = PlateNumber.builder()
                .owner(owner)
                .plateNumber(plateValue)
                .plateStatus(EPlateStatus.AVAILABLE)
                .issuedDate(LocalDateTime.now())
                .build();

        return plateNumberRepository.save(plateNumber);
    }
}
