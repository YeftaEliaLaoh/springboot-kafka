package com.springboot.redis.repositories;

import com.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class StudentRepositoryImpl implements  StudentRepository
{
    @Autowired
    JdbcTemplate jdbcTemplateObject;

    @Override
    public void update(String age,int studentId)
    {
        String SQL = "update student set age = ? where student_Id = ?";
        jdbcTemplateObject.update(SQL, age, studentId);
        System.out.println("Updated Record with ID = " + studentId );
    }

    @Override
    public <S extends Student> S save(S s)
    {
        return null;
    }

    @Override
    public <S extends Student> Iterable<S> saveAll(Iterable<S> iterable)
    {
        return null;
    }

    @Override
    public Optional<Student> findById(Long aLong)
    {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong)
    {
        return false;
    }

    @Override
    public Iterable<Student> findAll()
    {
        return null;
    }

    @Override
    public Iterable<Student> findAllById(Iterable<Long> iterable)
    {
        return null;
    }

    @Override
    public long count()
    {
        return 0;
    }

    @Override
    public void deleteById(Long aLong)
    {

    }

    @Override
    public void delete(Student student)
    {

    }

    @Override
    public void deleteAll(Iterable<? extends Student> iterable)
    {

    }

    @Override
    public void deleteAll()
    {

    }
}
