package com.bertin.vehicle_management;

import com.bertin.vehicle_management.enums.ERole;
import com.bertin.vehicle_management.services.IRoleService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@EnableCaching
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@RequiredArgsConstructor
@EnableTransactionManagement
@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
public class VehicleManagementApplication {

    private final IRoleService roleService;

    public static void main(String[] args) {
        SpringApplication.run(VehicleManagementApplication.class, args);
    }

    @PostConstruct
    public void seedData() {
        Set<ERole> userRoleSet = new HashSet<>();
        userRoleSet.add(ERole.ADMIN);
        userRoleSet.add(ERole.STANDARD);
        for (ERole role : userRoleSet) {
            if (!this.roleService.isRolePresent(role)) {
                this.roleService.createRole(role);
            }
        }
    }

}
