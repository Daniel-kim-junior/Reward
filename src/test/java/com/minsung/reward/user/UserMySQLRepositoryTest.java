package com.minsung.reward.user;

import com.minsung.reward.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

class UserMySQLRepositoryTest {
    @Autowired
    private EntityManager entityManager;
    @Test
    void join() {
//       give
        User user1 = User.builder()
                .userName("minsung")
                .uid(1L)
                .build();
//        when
        User user2 = entityManager.merge(user1);
//        then
        assertThat(user1).isEqualTo(user2);

    }

    @Test
    void find() {
    }

    @Test
    void getSize() {
    }

    @Test
    void emptyRepo() {
    }
}