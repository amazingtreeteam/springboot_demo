package com.example.demo.repository;

import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface TeacherRepository extends Repository<Teacher, Integer> {

    void save(Teacher teacher);

}
