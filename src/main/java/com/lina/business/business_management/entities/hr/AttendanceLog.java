package com.lina.business.business_management.entities.hr;

import java.sql.Timestamp;

import com.lina.business.business_management.entities.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "attendance_log")
public class AttendanceLog {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private Timestamp clockInTime;
    private Timestamp clockOutTime;

    @ManyToOne
    private User user;
    // The employee to whom this attendance log applies
    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getClockInTime() {
        return clockInTime;
    }

    public void setClockInTime(Timestamp clockInTime) {
        this.clockInTime = clockInTime;
    }

    public Timestamp getClockOutTime() {
        return clockOutTime;
    }

    public void setClockOutTime(Timestamp clockOutTime) {
        this.clockOutTime = clockOutTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    @Override
    public String toString() {
        return "AttendanceLog{" +
                "id=" + id +
                ", clockInTime=" + clockInTime +
                ", clockOutTime=" + clockOutTime +
                ", user=" + user +
                '}';
    }
}
