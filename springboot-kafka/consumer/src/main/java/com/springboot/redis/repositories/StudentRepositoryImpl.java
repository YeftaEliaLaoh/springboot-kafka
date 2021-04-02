package com.springboot.redis.repositories;

import com.springboot.model.Student;

import java.util.Optional;

public class StudentRepositoryImpl implements  StudentRepository
{
    @Override
    public void update(Student student)
    {

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
