package com.pratham.springbootspringwebservice.controller;


import com.pratham.springbootspringwebservice.model.Student;
import com.pratham.springbootspringwebservice.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/students")
@CrossOrigin(origins = "*")
public class StudentController {
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        System.out.println("Student added Successfully");
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        System.out.println("Student updated successfully");
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteStudentById(@PathVariable("id") String id) {
        System.out.println("Student Deleted Successfully");
         studentService.deleteStudentById(id);
    }

    @GetMapping(value = "/{id}")
    public Student getStudentById(@PathVariable("id") String id) {
        return studentService.getStudentById(id);
    }

    @GetMapping(value = "/deleteAll")
    public void deleteAllStudents() {
        studentService.deleteAllStudents();
    }

    @GetMapping()
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
