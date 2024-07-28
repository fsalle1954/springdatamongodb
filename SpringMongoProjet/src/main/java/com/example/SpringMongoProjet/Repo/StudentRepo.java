package com.example.SpringMongoProjet.Repo;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.SpringMongoProjet.Entity.Student;
public interface StudentRepo extends MongoRepository<Student,String>{



}
