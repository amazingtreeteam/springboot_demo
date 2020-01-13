package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity

@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(generator = "IDGenerator")
    private Integer id;

    private String teacherName;

    private Integer teacherAge;

    //@ManyToMany(mappedBy = "teachers")
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="teacher_id")//创建一个字段teacher_id，关联teacher表中的id字段
    private Set<Student> students;
}
