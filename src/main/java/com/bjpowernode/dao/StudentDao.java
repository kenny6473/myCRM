package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;
import com.bjpowernode.domain.StudentVo;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    int insertStudent(Student stu);
    List<Student> selectStudents();
    Student selectStudentById(Integer id);
    List<Map<String,Object>> select20();
    List<StudentVo> select21();
    List<StudentVo> select22(String name);

}
