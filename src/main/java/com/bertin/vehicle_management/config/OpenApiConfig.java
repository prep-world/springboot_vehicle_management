package com.bertin.vehicle_management.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(contact = @Contact(name = "Bertin Iradukunda", email = "contact@gmail.com", url = "http://localhost:8080/guest"), description = "OpenApi documentation for Vehicle Tracking Management System", title = "OpenApi specification - Bertin ", license = @License(name = "MIT", url = "https://some-url.com"), termsOfService = "Terms of service"), servers = {
                @Server(description = "Local ENV", url = "http://localhost:8080/api/v1"

                ),
                @Server(description = "Prod ENV", url = "https://api.vms.com"

                )
}, security = {
                @SecurityRequirement(name = "bearerAuth")
})
@SecurityScheme(name = "bearerAuth", description = "JWT auth description", scheme = "bearer", type = SecuritySchemeType.HTTP, bearerFormat = "JWT", in = SecuritySchemeIn.HEADER

)
public class OpenApiConfig {
}