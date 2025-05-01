package com.bertin.vehicle_management.dtos.request.auth;

import com.bertin.vehicle_management.annotations.ValidPassword;
import lombok.Data;

@Data
public class PasswordUpdateDTO {
    private String oldPassword;
    @ValidPassword(message = "Password should be strong")
    private String newPassword;
}