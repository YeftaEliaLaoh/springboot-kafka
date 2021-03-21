package com.springboot.service;

import com.springboot.model.Student;
import com.springboot.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaReceiver
{

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaReceiver.class);
    @Autowired
    private StudentRepository studentRepository;

    @KafkaListener(topics = "${kafka.topic.name}", groupId = "${kafka.consumer.group.id}")
    public void receiveData(Student student)
    {
        studentRepository.save(student);
        LOGGER.info("Data - " + student.toString() + " received");
    }
}
