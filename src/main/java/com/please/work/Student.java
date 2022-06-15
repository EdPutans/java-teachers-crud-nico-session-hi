package com.please.work;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Student implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  public Integer id;

  public String name;
  public Integer age;

  public Student(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public Student() {
    this.name = "Student";
    this.age = 22;
  }

  public Teacher teacher;

  @ManyToOne(cascade = CascadeType.ALL)
  public Teacher getTeacher() {
    return teacher;
  }
}
