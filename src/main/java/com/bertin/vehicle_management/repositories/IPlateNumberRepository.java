package com.bertin.vehicle_management.repositories;

import com.bertin.vehicle_management.models.PlateNumber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface IPlateNumberRepository extends JpaRepository<PlateNumber, UUID> {
    Optional<PlateNumber> findTopByOrderByIssuedDateDesc();

}
