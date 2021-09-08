package com.test.serviceone.component;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

@Component
public class HealthCheckIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder bldr) {
        bldr.up();
    }
}
