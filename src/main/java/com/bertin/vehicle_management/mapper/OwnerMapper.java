package com.bertin.vehicle_management.mapper;

import com.bertin.vehicle_management.dtos.response.owner.OwnerResponseDTO;
import com.bertin.vehicle_management.models.Owner;
import com.bertin.vehicle_management.models.User;
import org.springframework.stereotype.Component;

@Component
public class OwnerMapper {

    public static OwnerResponseDTO mapToOwnerResponseDTO(User user, Owner owner) {

        return OwnerResponseDTO.builder()
                .id(owner.getId())
                .fullName(user.getFirstName() + " " + user.getLastName())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .nationalId(user.getNationalId())
                .Address(owner.getAddress())
                .build();
    }

}
