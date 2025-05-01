package com.bertin.vehicle_management.dtos.request.user;

import com.bertin.vehicle_management.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserResponseDTO {
    private User user;
}