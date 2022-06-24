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
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "teachers")
public class Teacher implements Serializable {
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  public Integer id;

  public String name;
  public Integer age;

  @Column(name = "year_of_birth")
  public Integer yearOfBirth;

  @Column(name = "is_nico")
  public Boolean isNico;

  public Teacher(String name, Integer age, Boolean isNico) {
    this.name = name;
    this.age = age;
    this.isNico = isNico;
  }

  public Teacher() {
    this.name = "Henlo";
    this.age = 22;
    this.isNico = false;
  }

  @JsonIgnoreProperties("teachers")
  @ManyToMany(fetch = FetchType.LAZY, cascade = {
      CascadeType.MERGE
  })
  @JoinTable(name = "teacher_students", joinColumns = { @JoinColumn(name = "teacher_id") }, inverseJoinColumns = {
      @JoinColumn(name = "student_id") })
  public Set<Student> students = new HashSet<Student>();

}
