package com.alinesno.infra.bus.limit.adapter.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Kafka消费者类，用于接收指定Kafka主题的消息
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@Component
public class KafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    /**
     * 接收来自指定Kafka主题的消息
     * 
     * @param message 接收到的消息内容
     */
    @KafkaListener(topics = "business-limit", groupId = "group-id")
    public void receiveMessage(String message) {
        logger.debug("Received message: {}", message);
        // 处理接收到的消息
    }
}
