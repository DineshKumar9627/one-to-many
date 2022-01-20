package com.sunglowsys.test;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Student;
import com.sunglowsys.service.StudentServiceImpl;
import com.sunglowsys.service.StudentSrvice;

import java.util.ArrayList;
import java.util.List;


public class TestSaveStudent {

    public static void main(String[] args) {
        Address address = new Address("Bhudiya","Marehara","Kasganj","up","207401");
        Address address1 = new Address("Mohanpura","Marehara","kasganj","up","027123");
        List<Address> addresses = new ArrayList<>();
        addresses.add(address);
        addresses.add(address1);
        Student student = new Student("Yashveer","Singh","yashveer@gmail.com","8006025745",addresses);
        StudentSrvice studentSrvice = new StudentServiceImpl();
        Student result = studentSrvice.save(student);
        System.out.println(result);
    }
}
