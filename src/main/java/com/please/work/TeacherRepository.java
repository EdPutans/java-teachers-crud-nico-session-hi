package com.please.work;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

// public Collection<Teacher> findAllTeachersWithIdLessThan3(){
//      Collection<Teacher> teachersUnder3 = findAll();
//      return teachersUnder3;
//   }
}
