package com.please.work.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.please.work.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
