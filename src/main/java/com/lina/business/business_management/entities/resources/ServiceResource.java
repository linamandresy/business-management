package com.lina.business.business_management.entities.resources;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Service")
public class ServiceResource extends Resource {
    private String serviceDetails;
    private double serviceDuration; // in hours

    public double getServiceDuration() {
        return serviceDuration;
    }

    public void setServiceDuration(double serviceDuration) {
        this.serviceDuration = serviceDuration;
    }


    public String getServiceDetails() {
        return serviceDetails;
    }

    public void setServiceDetails(String serviceDetails) {
        this.serviceDetails = serviceDetails;
    }

    @Override
    public String toString() {
        return "ServiceResource{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", type=" + getType() +
                ", price=" + getPrice() +
                ", serviceDetails='" + serviceDetails + '\'' +
                ", serviceDuration=" + serviceDuration +
                '}';
    }
}
