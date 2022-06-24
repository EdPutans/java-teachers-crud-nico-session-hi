package com.please.work.bootstrap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.please.work.models.Student;
import com.please.work.models.Teacher;
import com.please.work.repos.StudentRepository;
import com.please.work.repos.TeacherRepository;

@Component
public class TeacherLoader implements CommandLineRunner {

  @Autowired
  TeacherRepository teacherRepo;

  @Autowired
  StudentRepository studentRepo;

  @Override
  public void run(String... args) throws Exception {
    seedTeachersAndStuds();
  }

  private void seedTeachersAndStuds() {
    teacherRepo.deleteAll();
    studentRepo.deleteAll();

    Teacher Nico = new Teacher("Nico", 34, true);
    Teacher Ed = new Teacher("Ed", 12, false);

    Student Gentrit = new Student("Gentrit", 22);
    Student Geri = new Student("Geri", 28);
    Student Elona = new Student("Elona", 22);
    Student Steve = new Student("Steve", 28);

    teacherRepo.save(Nico);
    teacherRepo.save(Ed);

    Geri.teachers.add(Ed);
    Geri.teachers.add(Nico);
    studentRepo.save(Geri);

    // studentRepo.save(Gentrit);
    // studentRepo.save(Geri);
    // studentRepo.save(Elona);
    // studentRepo.save(Steve);

    // Nico.students.add(Gentrit);
    // Nico.students.add(Geri);
    // Nico.students.add(Elona);

    // Ed.students.add(Steve);
    // Ed.students.add(Geri);

    // teacherRepo.save(Nico);
    // teacherRepo.save(Ed);
  }
}
