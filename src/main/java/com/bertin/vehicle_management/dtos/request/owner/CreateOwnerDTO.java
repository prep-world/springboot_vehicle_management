package com.bertin.vehicle_management.dtos.request.owner;

import com.bertin.vehicle_management.dtos.request.auth.RegisterUserDTO;
import lombok.Data;

@Data
public class CreateOwnerDTO extends RegisterUserDTO {
    private String address;
}
