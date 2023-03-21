package com.minsung.reward.repository;

import com.minsung.reward.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class UserMySQLRepository implements UserRepository {

    private final EntityManager em;

    @Override
    public void join(User user) {
        em.persist(user);
    }

    @Override
    public User find(Long uid) {
        return em.find(User.class, uid);
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void emptyRepo() {

    }




}
