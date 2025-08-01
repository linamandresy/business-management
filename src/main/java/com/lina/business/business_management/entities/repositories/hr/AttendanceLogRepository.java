package com.lina.business.business_management.entities.repositories.hr;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lina.business.business_management.entities.hr.AttendanceLog;

public interface AttendanceLogRepository extends JpaRepository<AttendanceLog, Long> {
    // Custom query methods (if needed) can be defined here
}
