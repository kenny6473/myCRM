package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.domain.StudentVo;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {
    /*
    * 引用类型自动注入@Aotuwired,@Resource
    * */
    @Resource
    private StudentDao studentDao;//自动寻找同名的类注入


    @Override
    public int addStudent(Student stu) {
        System.out.println("StudentServiceImpl.addStudent========");
        int num = studentDao.insertStudent(stu);
        return num;
    }

    @Override
    public List<Student> findStudent() {


        return studentDao.selectStudents();
    }

    public Student selStuById(Integer id){
        return studentDao.selectStudentById(id);
    }

    @Override
    public List<Map<String, Object>> find20() {
        return studentDao.select20();
    }

    @Override
    public List<StudentVo> find22(String name) {
        return studentDao.select22(name);
    }


}
