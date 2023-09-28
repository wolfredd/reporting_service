package com.sagatrading.reportingservice.config;


import com.sagatrading.reportingservice.redisSubscriber.RedisSubscriber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

@Configuration
public class RedisPubSubConfig {

    private final RedisSubscriber redisSubscriber;

    @Value("${CHANNEL_TOPIC}")
    private String channelTopic;
    //Setting the channel topic

    public RedisPubSubConfig(RedisSubscriber redisSubscriber) {
        this.redisSubscriber = redisSubscriber;
    }

    @Bean
    RedisMessageListenerContainer redisMessageListenerContainer(RedisConnectionFactory connectionFactory, MessageListenerAdapter messageListenerAdapter, ChannelTopic channelTopic) {
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.addMessageListener(messageListenerAdapter, channelTopic);
        return container;
    }

    @Bean
    MessageListenerAdapter messageListenerAdapter() {
        return new MessageListenerAdapter(redisSubscriber, "handleMessage");
    }

    @Bean
    ChannelTopic channelTopic() {
        System.out.println(channelTopic);
        return new ChannelTopic(channelTopic);
    }
}

