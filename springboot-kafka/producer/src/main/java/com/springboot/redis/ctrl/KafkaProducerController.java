package com.springboot.redis.ctrl;

import com.springboot.model.Student;
import com.springboot.redis.service.KafkaSender;
import com.springboot.redis.service.RedisMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafkaProducer")
public class KafkaProducerController
{
    @Autowired
    private KafkaSender kafkaSender;

    @Autowired
    private RedisMessagePublisher redisMessagePublisher;

    @PostMapping
    public ResponseEntity<String> sendData(@RequestBody Student student)
    {
        kafkaSender.sendData(student);
        redisMessagePublisher.publish(student.getFirstName() + " " + student.getLastName() + " " + student.getAge());
        return new ResponseEntity<>("Data sent to Kafka", HttpStatus.OK);
    }
}
