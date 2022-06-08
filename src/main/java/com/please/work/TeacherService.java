package com.please.work;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
  
  @Autowired
  TeacherRepository teacherRepository;

  public Collection<Teacher> getTeachers() {
    return teacherRepository.findAll();
  }

  public Teacher createTeacher() {
    Teacher newGuy = new Teacher("Nico, but in SQL", 34, true);
     return teacherRepository.save(newGuy);
  }
}
