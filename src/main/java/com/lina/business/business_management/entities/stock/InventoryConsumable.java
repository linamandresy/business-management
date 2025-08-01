package com.lina.business.business_management.entities.stock;

import java.sql.Date;

import com.lina.business.business_management.entities.User;
import com.lina.business.business_management.entities.resources.ConsumableResource;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class InventoryConsumable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private ConsumableResource consumableResource;
    private int quantity;
    private Date inventoryDate;
    @ManyToOne 
    private User user;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public ConsumableResource getConsumableResource() {
        return consumableResource;
    }
    public void setConsumableResource(ConsumableResource consumableResource) {
        this.consumableResource = consumableResource;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Date getInventoryDate() {
        return inventoryDate;
    }
    public void setInventoryDate(Date inventoryDate) {
        this.inventoryDate = inventoryDate;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    
}
