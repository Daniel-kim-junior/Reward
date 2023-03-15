package com.minsung.reward;

import com.minsung.reward.user.UserMemoryRepository;
import com.minsung.reward.user.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public static UserRepository getUserRepository() {
        return new UserMemoryRepository();
    }
}
