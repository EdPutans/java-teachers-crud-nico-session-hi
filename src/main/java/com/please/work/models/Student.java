package com.please.work.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Student implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "studentid")
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

  @JsonIgnoreProperties("students")
  @ManyToMany(fetch = FetchType.LAZY, mappedBy = "students", cascade = CascadeType.REMOVE)
  public Set<Teacher> teachers = new HashSet<>();
}
