package com.lina.business.business_management.entities.stock;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
@DiscriminatorValue("OUT")
public class SaleStockMovement extends StockMovement {
    private double pricePerUnit;


    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public String toString() {
        return "SaleStockMovement{" +
                "id=" + getId() +
                ", type=" + getType() +
                ", quantity=" + getQuantity() +
                ", item=" + getItem() +
                ", movementDate=" + getMovementDate() +
                ", pricePerUnit=" + pricePerUnit +
                '}';
    }
    
}
