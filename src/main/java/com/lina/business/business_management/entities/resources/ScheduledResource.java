package com.lina.business.business_management.entities.resources;

import java.time.temporal.ChronoUnit;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Scheduled")
public class ScheduledResource extends Resource {
    private ChronoUnit scheduleUnit; // e.g., DAYS, HOURS

    public ChronoUnit getScheduleUnit() {
        return scheduleUnit;
    }

    public void setScheduleUnit(ChronoUnit scheduleUnit) {
        this.scheduleUnit = scheduleUnit;
    }
    
}