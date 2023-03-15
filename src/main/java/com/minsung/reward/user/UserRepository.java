package com.minsung.reward.user;

import java.util.UUID;

public interface UserRepository {
    void join(User user);
    User find(UUID uid);
}
