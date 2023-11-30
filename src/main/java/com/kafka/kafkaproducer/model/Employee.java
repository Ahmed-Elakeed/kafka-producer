package com.kafka.kafkaproducer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class Employee {
    private Long id;
    private String name;
}
