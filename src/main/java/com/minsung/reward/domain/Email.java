package com.minsung.reward.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class Email {

    @Id @GeneratedValue
    @Column(name = "email_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private Address address;

}
