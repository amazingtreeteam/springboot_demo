package com.example.demo.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Set;


@Getter
@Setter
@Entity

@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(generator = "IDGenerator")
    private Integer id;

    private String studentName;

    private Integer studentAge;

    /*@ManyToMany
    @JoinTable(name = "student_teacher",
            joinColumns = {@JoinColumn(name = "student_id", referencedColumnName = "studentId")},
            inverseJoinColumns = {@JoinColumn(name = "teacher_id", referencedColumnName = "teacherId")}
    )*/
    @ManyToOne//可选属性optional=false,表示author不能为空。删除文章，不影响用户

    private Teacher teacher;
}
