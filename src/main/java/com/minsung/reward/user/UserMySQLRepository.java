package com.minsung.reward.user;

import com.minsung.reward.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class UserMySQLRepository implements UserRepository {

    private EntityManager entityManager;

    @Autowired
    private EntityManager em;


    @Override
    public void join(User user) {

    }

    @Override
    public User find(Long uid) {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void emptyRepo() {

    }
}
