package com.please.work.bootstrap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.please.work.Student;
import com.please.work.StudentRepository;
import com.please.work.Teacher;
import com.please.work.TeacherRepository;

@Component
public class TeacherLoader implements CommandLineRunner {

  @Autowired
  TeacherRepository teacherRepo;

  @Autowired
  StudentRepository studentRepo;

  @Override
  public void run(String... args) throws Exception {
    seedTeachersAndStuds();
    // banana();
    // toaster();
  }

  // public void banana() {
  // Teacher teacher = new Teacher("Banana man", 22, false);

  // Student student1 = new Student("Banana student 1", 22);
  // Student student2 = new Student("Banana John", 23);

  // teacher.students.add(student1);
  // teacher.students.add(student2);

  // teacherRepo.save(teacher);

  // }

  // public void toaster() {
  // Student student = new Student();
  // student.name = ("123-345-65454");

  // Student student2 = new Student();
  // student2.name = ("123-345-6542222");

  // // Add new Employee object
  // Teacher teacher = new Teacher("Toaster", 22, false);

  // Set<Student> studentsLol = new HashSet<>();
  // studentsLol.add(student);
  // studentsLol.add(student2);

  // teacher.students = studentsLol;

  // // Save Employee
  // teacherRepo.save(teacher);
  // }

  private void seedTeachersAndStuds() {
    // if (teacherRepo.count() == 0) {
    teacherRepo.deleteAll();
    studentRepo.deleteAll();

    Teacher Nico = new Teacher("Nico", 34, true);
    Teacher Ed = new Teacher("Ed", 12, false);

    Set<Student> students = new HashSet<>();

    Student Gentrit = new Student("Gentrit", 22);
    Student Geri = new Student("Geri", 28);

    students.add(Gentrit);
    students.add(Geri);
    // no need to studentRepo.save. nice
    Nico.students = students;

    teacherRepo.save(Nico);
    teacherRepo.save(Ed);
    // }
  }
}
