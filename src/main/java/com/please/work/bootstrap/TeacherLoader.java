package com.please.work.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.please.work.Teacher;
import com.please.work.TeacherRepository;

@Component
public class TeacherLoader implements CommandLineRunner {

  @Autowired
  TeacherRepository teacherRepo;

  public TeacherLoader(TeacherRepository teacherRepo) {
    this.teacherRepo = teacherRepo;
  }

  @Override
  public void run(String... args) throws Exception {
    seedTeachers();
  }

  private void seedTeachers() {
    // if (teacherRepo.count() == 0) {
    teacherRepo.save(
        new Teacher("I was bootstrapped!", 22, false));
    teacherRepo.save(
        new Teacher("Me too!", 22, true));
    // }
  }
}
