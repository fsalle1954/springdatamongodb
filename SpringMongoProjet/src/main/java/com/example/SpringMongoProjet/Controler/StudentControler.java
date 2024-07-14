package com.example.SpringMongoProjet.Controler;
import com.example.SpringMongoProjet.Entity.Student;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/vi/student")

public class StudentControler {
@PostMapping(value = "/save")
 

 private String saveStudent(@RequestBody Student students)
{
    return students.id ;
}
}