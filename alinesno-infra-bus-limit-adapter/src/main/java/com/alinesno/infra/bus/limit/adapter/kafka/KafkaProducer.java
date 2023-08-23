package com.alinesno.infra.bus.limit.adapter.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * Kafka生产者类，用于发送消息到指定的Kafka主题
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@Component
public class KafkaProducer {
    private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    /**
     * 发送消息到指定的Kafka主题
     *
     * @param topic   Kafka主题
     * @param message 消息内容
     */
    public void sendMessage(String topic, String message) {
        logger.debug("Sending message to topic: {}, message: {}", topic, message);
        kafkaTemplate.send(topic, message);
    }
}
