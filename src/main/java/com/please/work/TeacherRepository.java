package com.please.work;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface TeacherRepository {
  @Autowired
  SessionFactory sessionFactory;

  public void save(Teacher teacher) {
    Session session = sessionFactory.getCurrentSession();

    session.save(teacher);
  }
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