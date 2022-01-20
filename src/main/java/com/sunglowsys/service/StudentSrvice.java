package com.sunglowsys.service;

import com.sunglowsys.domain.Student;

import java.util.List;

public interface StudentSrvice {
    Student save(Student student);
    Student findById(Student student,Long id);
    List<String> findAll();
    Student  update(Student student,Long id);
    void delete(Long id);

}
