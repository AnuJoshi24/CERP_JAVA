package com.anupama.cerp;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@SpringBootApplication
@EnableCaching // to enable caching
@EnableWebSecurity
public class CerpApplication {

    public static void main(String[] args) {
        SpringApplication.run(CerpApplication.class, args);
    }

    @Bean
    public ModelMapper mapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }

//    @Bean
//    public RedisTemplate<Object, Object> sessionRedisTemplate(RedisConnectionFactory connectionFactory) {
//        RedisTemplate<Object, Object> template = new RedisTemplate<Object, Object>();
//        template.setKeySerializer(new StringRedisSerializer());
//        template.setHashKeySerializer(new StringRedisSerializer());
//
//        template.setDefaultSerializer(new GenericJackson2JsonRedisSerializer());
//
//        template.setConnectionFactory(connectionFactory);
//        return template;
//    }
}
