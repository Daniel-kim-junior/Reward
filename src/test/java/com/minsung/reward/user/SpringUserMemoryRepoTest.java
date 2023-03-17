package com.minsung.reward.user;
import com.minsung.reward.domain.User;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

// Spring Test Annotation
@SpringBootTest
public class SpringUserMemoryRepoTest {
    @Autowired
    private UserRepository userRepository;

    /*
    * User VO를 생성하고 Mem DAO에 접근하여 생성하는 Test
    * By Daniel
    * 2023-03-15
    * */
    @DisplayName("user join test")
    @Test
    void makeUser() {
//    User 생성 (give)
        User user1 = User.builder()
                .userName("minsung")
                .uid(1L)
                .build();

//      makeUser(when)
        userRepository.join(user1);
//      repo size
        int repoSize = userRepository.getSize();

//      is User Join? (then)
        assertThat(repoSize).isEqualTo(1);
    }

    /*
     * VO를 DAO를 이용해 Repo에서 찾는 메소드 test
     * By Daniel
     * 2023-03-15
     * */
    @DisplayName("find user test")
    @Test
    void findUser() {

        User user1 = User.builder()
                .userName("minsung")
                .uid(1L)
                .build();
//        give
        userRepository.join(user1);

//        when
        User user2 = userRepository.find(1L);

//        then
        assertThat(user1).isSameAs(user2);
    }

}
