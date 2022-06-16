package com.please.work.repos;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.please.work.models.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}

// @Transactional
// @Repository
// public class EmployerDao {
// @Autowired
// SessionFactory sessionFactory;

// public void save(Employer employer) {
// Session session = sessionFactory.getCurrentSession();

// session.save(employer);
// }

// }