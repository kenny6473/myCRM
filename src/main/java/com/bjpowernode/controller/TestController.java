package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/set/")
@Controller
public class TestController {

    private StudentService service;


    @RequestMapping("test.do")
    @ResponseBody
    public Student selStudent(Integer id){
        Student student  = new Student();
        student = service.selStuById(id);
        return student;
    }

}
