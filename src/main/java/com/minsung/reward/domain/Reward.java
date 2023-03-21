package com.minsung.reward.domain;

import com.minsung.reward.domain.item.RewardItem;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.*;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class Reward {

    @Id
    @GeneratedValue
    @Column(name = "reward_id")
    private Long id;

//    private Register register; // 리워드 등록자
    private String title; // 리워드 제목
    private LocalDateTime registerTime; // 등록 시간
    private LocalDateTime completedTime; // 완료 시간
    private String description; // 리워드 설명

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "item_id")
    private RewardItem rewardItem; // 리워드 타입


}
