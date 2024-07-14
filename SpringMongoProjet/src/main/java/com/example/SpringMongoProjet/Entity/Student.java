package com.example.SpringMongoProjet.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collation = "students")
public class Student {


@Id
private String _id;  
private String _studentname;  
private String  studentaddess;  
private String  mobile;    

    public Student(String _id, String _studentname, String mobile, String studentaddess) {
        this._id = _id;
        this._studentname = _studentname;
        this.mobile = mobile;
        this.studentaddess = studentaddess;
    }

    public Student() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_studentname() {
        return _studentname;
    }

    public void set_studentname(String _studentname) {
        this._studentname = _studentname;
    }

    public String getStudentaddess() {
        return studentaddess;
    }

    public void setStudentaddess(String studentaddess) {
        this.studentaddess = studentaddess;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("_id=").append(_id);
        sb.append(", _studentname=").append(_studentname);
        sb.append(", studentaddess=").append(studentaddess);
        sb.append(", mobile=").append(mobile);
        sb.append('}');
        return sb.toString();
    }

     

     
    






    


}
