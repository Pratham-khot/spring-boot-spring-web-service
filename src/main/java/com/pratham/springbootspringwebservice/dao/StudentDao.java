package com.pratham.springbootspringwebservice.dao;


import com.pratham.springbootspringwebservice.model.Student;
import lombok.AllArgsConstructor;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentDao extends MongoRepository<Student,String> {

}
