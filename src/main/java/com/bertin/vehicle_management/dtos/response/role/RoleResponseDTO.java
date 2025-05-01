package com.bertin.vehicle_management.dtos.response.role;

import com.bertin.vehicle_management.models.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class RoleResponseDTO {
    private Role role;
}