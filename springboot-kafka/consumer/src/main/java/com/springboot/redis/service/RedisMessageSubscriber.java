package com.springboot.redis.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class RedisMessageSubscriber implements MessageListener
{

    public static List<String> messageList = new ArrayList<String>();
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaReceiver.class);


    public void onMessage(final Message message, final byte[] pattern) {
        messageList.add(message.toString());
        LOGGER.info("Data Redis - " + message + " received");
    }
}
