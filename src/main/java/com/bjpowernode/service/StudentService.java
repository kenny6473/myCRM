package com.bjpowernode.service;

import com.bjpowernode.domain.Student;
import com.bjpowernode.domain.StudentVo;

import java.util.List;
import java.util.Map;

public interface StudentService {
    int addStudent(Student stu);
    List<Student> findStudent();
    Student selStuById(Integer id);
    List<Map<String,Object>> find20();
    List<StudentVo> find22(String name);
}
