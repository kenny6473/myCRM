package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.service.impl.StudentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/student/")
public class StudentController {

    @Resource
    private StudentService service;
    //注册学生
    @RequestMapping("addStudent.do")
    public ModelAndView addStudent(Student student){
        ModelAndView mv = new ModelAndView();
        //往数据库添加数据
        int nums = service.addStudent(student);

        String tips = "注册失败";
        if(nums>0){
            tips = "注册成功";
        }
        //request域添加数据
        mv.addObject("tips","学生【"+student.getName()+"】"+tips);
        //指定结果页面
        mv.setViewName("result");
        return mv;

    }

    /*@ResponseBody的作用其实是将java对象转为json格式的数据。*/
    @RequestMapping("queryStudent.do")
    @ResponseBody
    public List<Student> queryStudent(){
        List<Student> students = service.findStudent();
        return students;
    }


    @RequestMapping("findStudent.do")
    @ResponseBody
    public Student findStudent(Integer id){
        Student students = service.selStuById(id);
        return students;
    }
}
