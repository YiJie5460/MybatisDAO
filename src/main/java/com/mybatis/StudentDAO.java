package com.mybatis;

import com.mybatis.pojo.Student;

public interface StudentDAO {
    Student getStudent(Long id);
    Student listStudent();
    void addStudent(Student stu);
    void deleteStudent(Student stu);
    void updateStudent(Student stu);
}