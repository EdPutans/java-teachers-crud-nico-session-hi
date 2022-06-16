package com.please.work.models;

import java.util.HashSet;
import java.util.Set;

public class StudentDTO {
  public Integer id;

  public String name;
  public Integer age;

  public Set<Teacher> teachers = new HashSet<>();

  public StudentDTO(Student student) {
    this.age = student.age;
    this.name = student.name;
    this.id = student.id;

    for (Teacher teacher : student.teachers) {
      Teacher subTeacher = new Teacher(teacher.name, teacher.age, teacher.isNico);
      subTeacher.id = teacher.id;
      teacher.students = null;
      this.teachers.add(subTeacher);
    }
  }
}
