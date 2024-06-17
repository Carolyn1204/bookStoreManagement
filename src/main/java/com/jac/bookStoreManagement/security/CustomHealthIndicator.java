package com.jac.bookStoreManagement.security;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
       
        boolean isHealthy = checkCustomHealth();
        if (isHealthy) {
            return Health.up().withDetail("customHealth", "System goes well!").build();
        } else {
            return Health.down().withDetail("customHealth", "Something went wrong!").build();
        }
    }

    private boolean checkCustomHealth() {
        
        return true;
    }
}

