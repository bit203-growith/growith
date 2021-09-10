//package com.bit.growith.dao;
//
//import com.bit.growith.vo.Follow;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.stereotype.Repository;
//
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Repository
//public interface FollowRepository extends JpaRepository<Follow, Long> {
//
//    //팔로우 되어 있는지 카운트
//    int countByFollowerAndFollowingMemberEmail(long followerId, long followingId);
//
//    //언팔로우
//    @Modifying
//    @Transactional
//    void deleteByFollowingIdAndFollowerId(long followingId, long followerId);
//
//    //팔로우 리스트(흰버튼)
//    List<Follow> findByFollowingId(long followingId);
//
//    //팔로워 리스트(맞팔 체크 후 버튼 색 결정)
//    List<Follow> findByFollowerId(long followerId);
//}
