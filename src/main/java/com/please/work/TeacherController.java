package com.please.work;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

  @Autowired
  TeacherService teacherService;

 @GetMapping("/teachers")
  public Collection<Teacher> getTeachers() {
      return teacherService.getTeachers();
    }

  @PostMapping("/teachers")
  public Teacher createTeacher(){
   return teacherService.createTeacher();
  }
}
