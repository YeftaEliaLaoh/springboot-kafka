package com.springboot.redis.repositories;

import com.springboot.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>
{
    void update(String age,int studentId);
}

