package com.bit.growith.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Many;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecruitBoards extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recruitBoardId;

    @Column(name = "teamsId")
    private Long teamsId;

//    @Column(name = "applyId") //식별관계로 해야할듯?
//    private Long applyId;

    @Lob
    private String recruitBoardContent;

    @ColumnDefault("0")
    private int likeCount;

    @Column
    private int isDelete;

//    @ColumnDefault("0")
//    private int reportCount;

    @OneToMany(mappedBy = "recruitBoards", fetch = FetchType.EAGER, cascade = CascadeType.ALL) //mappedBy 연관관계의 주인이 아니다(난FK가아니다) DB에 컬럼만들지마라
    private List<Replies> replies;

    @OneToMany(mappedBy = "recruitBoards", cascade = CascadeType.ALL)
    private List<Files> files;

    @OneToMany(mappedBy = "recruitBoards", cascade = CascadeType.ALL)
    private List<LikeBoards> likeBoards;




    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teamsId")
    private Teams teams;

//    @OneToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "applyId")
//    private TeamMembers teamMembers;

}
