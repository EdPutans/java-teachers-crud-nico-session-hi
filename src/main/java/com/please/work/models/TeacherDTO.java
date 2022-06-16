package com.please.work.models;

import java.util.HashSet;
import java.util.Set;

public class TeacherDTO {
  public Integer id;

  public String name;
  public Integer age;
  public Boolean isNico;
  public Set<Student> students = new HashSet<>();

  public TeacherDTO(Teacher teacher) {
    this.age = teacher.age;
    this.name = teacher.name;
    this.id = teacher.id;

    for (Student student : teacher.students) {
      Student subStudent = new Student(student.name, student.age);
      subStudent.id = teacher.id;

      this.students.add(subStudent);
    }
  }
}
