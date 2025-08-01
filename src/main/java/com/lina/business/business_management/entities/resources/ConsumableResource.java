package com.lina.business.business_management.entities.resources;

import java.sql.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Consumable")
public class ConsumableResource extends Resource {
    private int quantityAvailable;
    Date expirationDate;
    public int getQuantityAvailable() {
        return quantityAvailable;
    }
    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }
    public Date getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
            
    @Override
    public String toString() {
        return "ConsumableResource{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", type=" + getType() +
                ", price=" + getPrice() +
                ", quantityAvailable=" + quantityAvailable +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
