package com.edu.discoveryserver.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.stereotype.Component;
public class CustomHealthIndicator extends AbstractHealthIndicator{
    @Override
    protected void doHealthCheck(Builder builder) throws Exception {
        builder.up()
                .withDetail("details", "My custom health indicator");
    }
}
