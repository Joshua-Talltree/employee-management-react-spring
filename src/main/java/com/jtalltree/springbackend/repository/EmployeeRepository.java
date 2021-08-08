package com.jtalltree.springbackend.repository;

import com.jtalltree.springbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
