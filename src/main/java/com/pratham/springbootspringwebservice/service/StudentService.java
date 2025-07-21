package com.pratham.springbootspringwebservice.service;


import com.pratham.springbootspringwebservice.dao.StudentDao;
import com.pratham.springbootspringwebservice.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private StudentDao studentDao;

    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

    public Student getStudentById(String id) {
        return studentDao.findById(id).orElse(null);
    }

    public Student addStudent(Student student) {
        return studentDao.save(student);
    }


    public Student updateStudent(Student student) {
        return studentDao.save(student);
    }

    public void deleteStudentById(String id) {
         studentDao.deleteById(id);
    }

    public void deleteAllStudents() {
         studentDao.deleteAll();
    }
}
