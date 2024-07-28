package com.example.SpringMongoProjet.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "students")

//@Document(collation = "students")

//@Document(collection ="students")
public class Student {


@Id
 public String id;  
//private String id;
   
private String studentname;  
private String  studentaddress;  
private String  mobile;


  
}
