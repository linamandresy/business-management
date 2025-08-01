package com.lina.business.business_management.entities.stock;

import java.sql.Date;

import com.lina.business.business_management.entities.resources.ConsumableResource;
import com.lina.business.business_management.utils.StockMovementType;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.ManyToOne;

@Entity
@Inheritance(strategy = jakarta.persistence.InheritanceType.JOINED)
@DiscriminatorColumn(name = "stock_movement_type")
public class StockMovement {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private StockMovementType type;
    private int quantity;
    @ManyToOne
    private ConsumableResource item;
    private Date movementDate;

    public Date getMovementDate() {
        return movementDate;
    }

    public void setMovementDate(Date movementDate) {
        this.movementDate = movementDate;
    }

    @Override
    public String toString() {
        return "StockMovement{" +
                "id=" + id +
                ", type=" + type +
                ", quantity=" + quantity +
                ", item=" + item +
                ", movementDate=" + movementDate +
                '}';
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StockMovementType getType() {
        return type;
    }

    public void setType(StockMovementType type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ConsumableResource getItem() {
        return item;
    }

    public void setItem(ConsumableResource item) {
        this.item = item;
    }
    
}
