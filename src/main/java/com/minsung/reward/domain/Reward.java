package com.minsung.reward.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Getter
public class Reward {

    @Id
    @GeneratedValue
    @Column(name = "reward_id")
    private Long id;

    private String title;

    private String description;

    private int rewardPrice;


}
