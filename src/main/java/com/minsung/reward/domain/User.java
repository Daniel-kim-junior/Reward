package com.minsung.reward.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class User {
    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;
    @Column(name = "user_name")
    private String name;

    @OneToOne
    @JoinColumn(name = "email_id")
    private Email email;

}
