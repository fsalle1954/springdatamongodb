package com.example.SpringMongoProjet.Controler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringMongoProjet.Entity.Student;
import com.example.SpringMongoProjet.Service.StudentServices;


 

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/student")

public class StudentControler {

@Autowired
private StudentServices studentServices;
@PostMapping(value = "/save")
 

 public String saveStudent(@RequestBody Student students)
{
    studentServices.saveorUpdate(students);
    // Student savueUser = new Student();

     
   //return students.get._id() ;
 return  students.getId() ;
}
@GetMapping("/getall")
public Iterable<Student>getStudents()
   { 
    return studentServices.ListAll();
}

    @PutMapping("/edit/{id}")
public Student update(@RequestBody Student student,@PathVariable(name="id")String id)
   { student.setId(id);
   studentServices.saveorUpdate(student);
   return student;
}

@DeleteMapping("/delete/{id}")
public  void deleteStudent(@PathVariable("id") String id)
   {  
   studentServices.deleteStudent(id);
 
}

@GetMapping("/{id}")
public Student getSudentsbyid(@PathVariable String id) {
        return studentServices.getStudentByID(id);
                
    }
 

@RequestMapping("/search/{id}")
 public Student getStudents(@PathVariable(name="id")String studentid)
// private Student getStudents(@PathVariable("id")String _id)
{
  return studentServices.getStudentByID(studentid);
}
}

 