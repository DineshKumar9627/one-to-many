package com.sunglowsys.repository;

import com.sunglowsys.domain.Student;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentRepositoryImpl  implements StudentRepository{
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();


    @Override
    public Student save(Student student) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Long id = (Long) session.save(student);
        session.getTransaction().commit();
        Student result = session.get(Student.class,id);

        return result;


    }

    @Override
    public Student findById(Student student, Long id) {
        return null;
    }

    @Override
    public List<String> findAll() {
        return null;
    }

    @Override
    public Student update(Student student, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
