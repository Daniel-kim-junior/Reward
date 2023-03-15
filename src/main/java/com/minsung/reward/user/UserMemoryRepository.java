package com.minsung.reward.user;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

// User MemoryRepo for MemoryRepository
@Component
public class UserMemoryRepository implements UserRepository {
    private static final Map<UUID, User> memoryRepository = new ConcurrentHashMap<>();

    @Override
    public void join(User user) {
        memoryRepository.put(user.uid, user);
    }

    @Override
    public User find(UUID uid) {
        return memoryRepository.get(uid);
    }

    @Override
    public int getSize() {
        return memoryRepository.size();
    }

    @Override
    public void emptyRepo() {
        memoryRepository.clear();
    }


}
