package com.bertin.vehicle_management.services;

import com.bertin.vehicle_management.dtos.request.role.CreateRoleDTO;
import com.bertin.vehicle_management.dtos.response.role.RoleResponseDTO;
import com.bertin.vehicle_management.dtos.response.role.RolesResponseDTO;
import com.bertin.vehicle_management.enums.ERole;
import com.bertin.vehicle_management.models.Role;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface IRoleService {
    public Role getRoleById(UUID roleId);

    public Role getRoleByName(ERole roleName);

    public void createRole(ERole roleName);

    public RoleResponseDTO createRole(CreateRoleDTO createRoleDTO);

    public RolesResponseDTO getRoles(Pageable pageable);

    public void deleteRole(UUID roleId);

    public boolean isRolePresent(ERole roleName);
}