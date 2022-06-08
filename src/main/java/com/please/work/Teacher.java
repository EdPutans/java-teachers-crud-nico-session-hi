package com.please.work;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teacher {
  @Id
  @GeneratedValue
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

  public Teacher (){
    this.name = "Henlo";
    this.age = 22;
    this.isNico = false;
  }  
}
