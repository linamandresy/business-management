package com.lina.business.business_management.entities.hr;

import com.lina.business.business_management.entities.User;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "wage_employee")
public class WageEmployee {
    @Id
    private Long id;
    private String appliedDate; // Date when the wage was applied
    private boolean isNormalWage; // Indicates if this is a normal wage or not
    private double hourlyWage;
    private double hoursWorked;

    @ManyToOne
    private User user; // The employee to whom this wage applies

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double calculateWage() {
        return hourlyWage * hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(String appliedDate) {
        this.appliedDate = appliedDate;
    }

    public boolean isNormalWage() {
        return isNormalWage;
    }

    public void setNormalWage(boolean isNormalWage) {
        this.isNormalWage = isNormalWage;
    }
}
