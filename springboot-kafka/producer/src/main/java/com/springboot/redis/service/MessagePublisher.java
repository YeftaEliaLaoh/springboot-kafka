package com.springboot.redis.service;

public interface MessagePublisher {

    void publish(final String message);
}