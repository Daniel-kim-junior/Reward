package com.minsung.reward.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Setter @Getter
@RequiredArgsConstructor
public class User {
    @Id @GeneratedValue
    private Long uid;
    private String userName;


}
