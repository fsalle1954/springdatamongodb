package com.example.SpringMongoProjet.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringMongoProjet.Entity.Student;
import com.example.SpringMongoProjet.Repo.StudentRepo;
 

@Service
public class StudentServices {
@Autowired 
private StudentRepo repo;

//@Autowired
 //   private MongoOperations mongoOperations;

 //   public static final String COLLECTION_NAME = "students";
 //   @Autowired
//    private GridFsTemplate gridFsTemplate;

public void saveorUpdate(Student students) {

repo.save(students);
}
public Iterable<Student> ListAll() {

    return this.repo.findAll();
    //return this.repo.findAll() ;

}

public void deleteStudent(String id) {
  
   repo.deleteById(id) ;
  // void deleteById(id);
}

public Student getStudentByID(String studentid)
{

      // GridFSFile file = gridFsTemplate.findOne(new Query(Criteria.where("_id").is(studentid))); 
      //  Video video = new Video(); 
      //  video.setTitle(file.getMetadata().get("title").toString()); 
    
    //  return new GridFsResource(file, getGridFs().openDownloadStream(file.getObjectId()));
return repo.findById(studentid).get();

}

}
