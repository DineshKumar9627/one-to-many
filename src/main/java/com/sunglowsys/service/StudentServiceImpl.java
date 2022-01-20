package com.sunglowsys.service;

import com.sunglowsys.domain.Student;
import com.sunglowsys.repository.StudentRepository;
import com.sunglowsys.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements StudentSrvice {

    private StudentRepository studentRepository = new StudentRepositoryImpl();
    @Override
    public Student save(Student student) {

        return studentRepository.save(student);
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
