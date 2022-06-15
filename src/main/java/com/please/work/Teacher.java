package com.please.work;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Teacher implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", unique = true, nullable = false)
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

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "teacher")
  public Set<Student> students = new HashSet<Student>();
}
