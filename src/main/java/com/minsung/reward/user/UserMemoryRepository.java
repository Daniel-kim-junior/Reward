package com.minsung.reward.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// User MemoryRepo for MemoryRepository
@Repository
public class UserMemoryRepository implements UserRepository {
    private static final Map<Long, User> memoryRepository = new ConcurrentHashMap<>();

    @Override
    public void join(User user) {
        memoryRepository.put(user.getUid(), user);
    }

    @Override
    public User find(Long uid) {
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
