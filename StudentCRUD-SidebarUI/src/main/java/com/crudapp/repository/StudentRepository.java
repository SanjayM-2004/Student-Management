package com.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crudapp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
