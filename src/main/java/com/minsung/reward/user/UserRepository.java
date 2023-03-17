package com.minsung.reward.user;

import com.minsung.reward.domain.User;

public interface UserRepository {
    void join(User user);
    User find(Long uid);
    int getSize();

    void emptyRepo();
}
