package com.lina.business.business_management.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lina.business.business_management.entities.AttendanceLog;

public interface AttendanceLogRepository extends JpaRepository<AttendanceLog, Long> {
    // Custom query methods (if needed) can be defined here
}
