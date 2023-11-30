package com.kafka.kafkaproducer.producer;


import com.kafka.kafkaproducer.model.Employee;
import com.kafka.kafkaproducer.util.KafkaLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaProducerController {

    private final KafkaTemplate<Object, Object> kafkaTemplate;

    private Long idSequence = 1L;

    @GetMapping(path = "/produce/{employeeName}")
    public Object sendMessage(@PathVariable(value = "employeeName") String employeeName){
        Employee employee=new Employee(idSequence++,employeeName);
        KafkaLogger.LOGGER().info("Produced : "+employee);
        this.kafkaTemplate.send("LogTopic",employee);
        return employee;
    }
}
