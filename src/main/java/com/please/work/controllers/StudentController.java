package com.please.work.controllers;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.please.work.models.Student;
import com.please.work.repos.StudentRepository;

@RestController
public class StudentController {

  @Autowired
  StudentRepository studentsRepo;

  @GetMapping("/students")
  @JsonIgnoreProperties("teachers")
  public Collection<Student> getStudents() {
    return studentsRepo.findAll();
  }

  @GetMapping("/teacherForStudentOne")
  public Optional<Student> getTeachsssss() {
    return studentsRepo.findById(1);
  }

  @PostMapping("/students")
  public Student createStudent() {
    Student newGuy = new Student("Nico, but in SQL", 34);
    return studentsRepo.save(newGuy);
  }
}
