package com.minsung.reward.user;

import java.util.UUID;

public class User {
    UUID uid;
    String userName;

    public User(UUID uid, String userName) {
        this.uid = uid;
        this.userName = userName;
    }

}
