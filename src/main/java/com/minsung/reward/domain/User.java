package com.minsung.reward.domain;

import lombok.*;

import javax.persistence.*;
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder(builderMethodName = "UserBuilder")
public class User {
    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private EmailAddr email;


}
