package com.minsung.reward.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class RewardList {

    @Id
    @GeneratedValue
    @Column(name = "reward_list_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "reward_id")
    private Reward reward;

    private LocalDateTime apply; // 응모 시간



}
