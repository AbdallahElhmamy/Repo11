package com.LMS.Learning_Management_System.repository;

//package com.lms.learning_management_system.repository;

import com.LMS.Learning_Management_System.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
