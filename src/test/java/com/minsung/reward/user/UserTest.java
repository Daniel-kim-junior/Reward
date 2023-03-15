package com.minsung.reward.user;
import com.minsung.reward.SpringConfig;
import org.junit.jupiter.api.*;
import java.util.UUID;
import static org.assertj.core.api.Assertions.*;

public class UserTest {
    static UserRepository userRepository;
    @BeforeAll
    static void beforeAll() throws Exception {
        try {
            userRepository = SpringConfig.getUserRepository();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @AfterEach
    void afterEach() throws Exception {
//       repository 초기화
        userRepository.emptyRepo();
    }

    /*
    * User VO를 생성하고 Mem DAO에 접근하여 생성하는 Test
    * By Daniel
    * 2023-03-15
    * */
    @DisplayName("user join test")
    @Test
    void makeUser() {
        UUID uid = UUID.randomUUID();
//    User 생성 (give)
        User user1 = new User(uid , "minsung");

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
        UUID uid = UUID.randomUUID();
        User user1 = new User(uid, "minsung");

//        give
        userRepository.join(user1);

//        when
        User user2 = userRepository.find(uid);

//        then
        assertThat(user1).isSameAs(user2);
    }

}
