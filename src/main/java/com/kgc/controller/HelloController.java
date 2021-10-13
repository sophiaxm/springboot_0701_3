package com.kgc.controller;

import com.kgc.pojo.Student;
import com.kgc.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private Student stu;

    @Autowired
    private Teacher teacher;

    @RequestMapping("/show")
    public String show(){
        return "hello springboot";
    }

    /*@RequestMapping(value = "/showStu",method = RequestMethod.GET)*/
    @GetMapping("/showStu")
    public Student getStu(){
       return stu;
    }


    @GetMapping("/showTeacher")
    public Teacher getTeacher(){
        return teacher;
    }


   /* @RequestMapping(value = "/showList",method = RequestMethod.POST)*/
    @PostMapping("/showList")
    public List<Student> getList(){
        List<Student> list=new ArrayList<>();
        Student s=new Student("aa",23);
        Student stu=new Student();
        stu.setName("貂蝉");
        stu.setAge(25);
        list.add(stu);
        Student stu2=new Student();
        stu2.setName("貂蝉");
        stu2.setAge(25);
        list.add(stu2);
        return list;
    }
}
