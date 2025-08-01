package com.lina.business.business_management.core;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;

enum Status {
    PENDING,
    VALIDATED,
    CANCELLED
}

@MappedSuperclass
public class StatusClass {
    private Status status;

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public StatusClass() {
        this.status = Status.PENDING; // Default status
    }

    public StatusClass(Status status) {
        this.status = status;
    }
    public void validate(){
        if (status == Status.PENDING) {
            status = Status.VALIDATED;
        } else {
            throw new IllegalStateException("Cannot validate a non-pending status");
        }
    }
    public void cancel() {
        if (status == Status.PENDING) {
            status = Status.CANCELLED;
        } else {
            throw new IllegalStateException("Cannot cancel a non-pending status");
        }
    }
    public void validate(JpaRepository repository) {
        validate();
        repository.save(this);
    }

    public void cancel(JpaRepository repository) {
        cancel();
        repository.save(this);
    }
}
