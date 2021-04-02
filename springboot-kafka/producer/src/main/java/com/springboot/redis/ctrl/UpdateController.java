package com.springboot.redis.ctrl;

import com.springboot.model.Kelas;
import com.springboot.model.Student;
import com.springboot.redis.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/update")
public class UpdateController
{
    @Autowired
    StudentRepository studentRepository;

//    @Autowired
//    Kelas kelas;

    List<Student> studentList = new ArrayList<>();

    @PostMapping
    public ResponseEntity<String> sendData(@RequestBody Student student)
    {
        //kelas.add(student);
        //studentList.contains(student.getStudentId());
        studentRepository.update(student.getAge(),student.getStudentId());
        return new ResponseEntity<>("Data update ", HttpStatus.OK);
    }
}
