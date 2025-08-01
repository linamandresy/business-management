package com.lina.business.business_management.entities.stock;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
@DiscriminatorValue("IN")
public class SupplyStockMovement extends StockMovement {
    private double pricePerUnit;
    @ManyToOne
    private SupplyOrder supplyOrder;
    public double getPricePerUnit() {
        return pricePerUnit;
    }
    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
    public SupplyOrder getSupplyOrder() {
        return supplyOrder;
    }
    public void setSupplyOrder(SupplyOrder supplyOrder) {
        this.supplyOrder = supplyOrder;
    }
    
}
