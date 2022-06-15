package com.please.work;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

  @Autowired
  TeacherRepository teacherRepository;

  @GetMapping("/teachers")
  public Collection<Teacher> getTeachers() {
    return teacherRepository.findAll();
  }

  @PostMapping("/teachers")
  public Teacher createTeacher() {
    Teacher newGuy = new Teacher("Nico, but in SQL", 34, true);
    return teacherRepository.save(newGuy);
  }
}
