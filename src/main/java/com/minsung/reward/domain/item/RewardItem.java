package com.minsung.reward.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "rtype")
public abstract class RewardItem {
    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long id;
    private String title;



}
