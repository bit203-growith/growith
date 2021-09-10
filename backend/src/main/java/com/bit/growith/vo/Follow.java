package com.bit.growith.vo;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "follows")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Follow {

    @Id
    @Column(name = "follow_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long followId;

    //following이 follower를 follow함
    @ManyToOne
    @JoinColumn(name = "following_id")
    private Member followingId; //from

    @ManyToOne
    @JoinColumn(name = "follower_id")
    private Member followerId; //to



    //힘들면 Id 하나로 만들고 테스트 다 한다음 복합키로 바꿔도 ㄱㅊ
}
