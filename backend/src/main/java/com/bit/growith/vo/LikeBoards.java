package com.bit.growith.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LikeBoards extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likeBoardId;

    @Column
    private Long recruitBoardId;

    @Column
    private Long memberId;

    @ManyToOne
    @JoinColumn(name = "recruitBoardId")
    private RecruitBoards recruitBoards;

    @ManyToOne
    @JoinColumn(name = "memberId")
    private Member member;
}
