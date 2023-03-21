package com.minsung.reward.service;

import com.minsung.reward.domain.User;
import com.minsung.reward.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    @Transactional
    public void save(User user) {
        repository.join(user);
    }

    public User findOne(Long id) {
        return repository.find(id);
    }

}
