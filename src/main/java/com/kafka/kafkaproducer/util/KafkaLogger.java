package com.kafka.kafkaproducer.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KafkaLogger {

    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaLogger.class);

    public static Logger LOGGER(){
        return LOGGER;
    }
}
