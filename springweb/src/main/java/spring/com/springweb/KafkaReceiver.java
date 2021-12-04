package spring.com.springweb;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;


@Component
public class KafkaReceiver {

    private static final Logger logger = LoggerFactory.getLogger(KafkaReceiver.class);

    @KafkaListener(groupId = "group-id-string-1", topics = "netsurfingzone-topic-1", topicPartitions =
            {@TopicPartition(topic = "netsurfingzone-topic-1", partitions = { "0"})},
            containerFactory = "kafkaListenerContainerFactory")
    public void receivedMessage(String message) {
        logger.info("Message Received in spring web app using Kafka listener " + message);
    }
}