package com.sunglowsys.repository;

import com.sunglowsys.domain.Student;

import java.util.List;

public interface StudentRepository {
    Student save(Student student);
    Student findById(Student student,Long id);
    List<String> findAll();
    Student  update(Student student,Long id);
    void delete(Long id);

}
