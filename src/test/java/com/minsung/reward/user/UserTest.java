package com.minsung.reward.user;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.*;

public class UserTest {
    static UserRepository userRepository;
    @BeforeAll
    static void beforeAll() {
        userRepository = new UserMemoryRepository();
    }

    /*
    * User DAO를 생성하는 Test
    * By Daniel
    * 2023-03-15
    * */
    @DisplayName("make user test")
    @Test
    void makeUser() {
        UUID uid = UUID.randomUUID();
//    User 생성 (give)
        User user1 = new User(uid , "minsung");

//      makeUser(when)
        userRepository.join(user1);
//      findUser
        User user2 = userRepository.find(uid);


//      is User Join? (then)
        assertThat(user1).isSameAs(user2);
    }
}
