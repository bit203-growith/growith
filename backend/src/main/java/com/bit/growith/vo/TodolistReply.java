package com.bit.growith.vo;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodolistReply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long todolistReplyId;

    @ManyToOne
    @JoinColumn(name = "todolist_id")
    private Todolist todolist;

    @ManyToOne
    @JoinColumn(name = "emoji_id")
    private Emoji emoji;

    @ManyToOne
    @JoinColumn(name = "follow_id")
    private Follow follow;
}
