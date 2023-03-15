package com.minsung.reward.user;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

// User MemoryRepo for MemoryRepository
public class UserMemoryRepository implements UserRepository {
    Map<UUID, User> memoryRepository = new ConcurrentHashMap<>();
    @Override
    public void join(User user) {
        memoryRepository.put(user.uid, user);
    }

    @Override
    public User find(UUID uid) {
        return memoryRepository.get(uid);
    }
}
