package com.example.demo.repository;

import com.example.demo.entity.Student;
import com.example.demo.entity.SysUsers;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface StudentRepository extends Repository<Student, Integer> {

    void save(Student student);

    List<Student> findAllByStudentAge(Integer age);

    List<Student> findStudentByStudentAge(Integer age);
}
