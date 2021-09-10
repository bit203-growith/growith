package com.bit.growith.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Replies extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long replyId;

    @Column
    private Long recruitBoardsId;

    @Column(nullable = false,length = 200)
    private String replyContent;

    @Column
    private int isDelete;

    @ColumnDefault("0")
    private int likeCount;

//    @ColumnDefault("0")
//    private int reportCount;

    @ManyToOne
    @JoinColumn(name = "recruitBoardId")
    private RecruitBoards recruitBoards;

    @ManyToOne
    @JoinColumn(name = "memberId")
    private Member member;

    @OneToMany(mappedBy = "replies", cascade = CascadeType.ALL)
    private List<LikeReplies> likeReplies;

}
