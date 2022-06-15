package com.please.work;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

  // @Autowired
  // StudentRepository studentsRepo;

  // @GetMapping("/students")
  // public Collection<Student> getStudents() {
  // return studentsRepo.findAll();
  // }

  // @GetMapping("/teacherForStudentOne")
  // public Optional<Student> getTeachsssss() {
  // return studentsRepo.findById(1);
  // }

  // @PostMapping("/students")
  // public Student createStudent() {
  // Student newGuy = new Student("Nico, but in SQL", 34);
  // return studentsRepo.save(newGuy);
  // }
}
