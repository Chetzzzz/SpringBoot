package com.example.SpringBoot_REST_.APIs.controller;

import com.example.SpringBoot_REST_.APIs.model.student;
import com.example.SpringBoot_REST_.APIs.repository.student_repository_JPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentController {

    @Autowired
    private  final student_repository_JPA studentRepositoryJpa;

    public studentController(student_repository_JPA studentRepositoryJpa) {
        this.studentRepositoryJpa = studentRepositoryJpa;
    }


    @GetMapping("/student")
    public List<student> getStudents(){
        List<student>students = studentRepositoryJpa.findAll();
        return students;

    }

    @GetMapping("/student/{id}")
    public student getStudent(@PathVariable Long id){

        return studentRepositoryJpa.findById(id).
                orElseThrow(()-> new RuntimeException("Student Not Found"));
    }

    @PostMapping("/student/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addStudent(@RequestBody student stu){
        studentRepositoryJpa.save(stu);
        System.out.println("Student Saved");
    }

    @PutMapping("/student/update/{id}")
    public student updateStudent(@PathVariable Long id){
student student = studentRepositoryJpa.findById(id).orElseThrow(()-> new RuntimeException("Student Not Found"));
 student.setName("CarryMinati");
 student.setAge(29);
 student.setEmail("carry@gmail.com");
 studentRepositoryJpa.save(student);
 return student;

    }

    @DeleteMapping("/student/delete/{id}")

    public void deleteStudent(@PathVariable Long id){
        student student = studentRepositoryJpa.findById(id).orElseThrow(()-> new RuntimeException("Student Not Found"));
       studentRepositoryJpa.delete(student);
        System.out.println("Student Deleted");


    }

}
