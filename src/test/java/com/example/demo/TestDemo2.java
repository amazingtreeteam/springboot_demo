package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.SysUsersRepository;
import com.example.demo.repository.TeacherRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestDemo2 {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void testDemo() {
        Set<Student> students = new HashSet<>();

        Teacher teacher = new Teacher();
        teacher.setTeacherName("王老师");
        teacher.setTeacherAge(60);

        Student student01 = new Student();
        //student01.setId(1);
        student01.setStudentAge(12);
        student01.setStudentName("小明");
        //student01.setTeacher(teacher);

        Student student02 = new Student();
        //student02.setId(2);
        student02.setStudentAge(15);
        student02.setStudentName("小红");
        //student02.setTeacher(teacher);

        students.add(student01);
        students.add(student02);

        teacher.setStudents(students);

        //teacher.setId(1);

        teacherRepository.save(teacher);
    }
}
