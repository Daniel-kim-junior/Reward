package com.minsung.reward.user;
import com.minsung.reward.domain.EmailAddr;
import com.minsung.reward.domain.User;
import com.minsung.reward.repository.UserMySQLRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
@Transactional
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserRepositoryTest {

    @Autowired
    UserMySQLRepository userMySQLRepository;

    // MockUser
    private User makeMockUser(String name, EmailAddr emailAddr) {
        return User.UserBuilder()
                .name(name)
                .email(emailAddr)
                .build();
    }

    @Test
    void join() {
//       give
        User user1 = makeMockUser("민성", EmailAddr.GMAIL);
        // when
        userMySQLRepository.join(user1);
        // then
        User user2 = userMySQLRepository.find(1L);
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