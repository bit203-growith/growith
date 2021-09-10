//package com.bit.growith.service;
//
//import com.bit.growith.dao.FollowRepository;
//import com.bit.growith.vo.Follow;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class FollowServiceImpl implements FollowService{
//
//    final private FollowRepository followRepository;
//    final private MemberService memberService;
//
//    //팔로우
//    public void save(long memberId, long pageId) {
//        Follow follow = new Follow();
//
//        follow.setFollowingId(memberService.findById(memberId));
//        follow.setFollowerId(memberService.findById(pageId));
//
//        followRepository.save(follow);
//    }
//
//    //언팔로우
//    public void deleteByFollowingIdAndFollowerId(long followingId, long followerId) {
//        followRepository.deleteByFollowingIdAndFollowerId(followingId, followerId);
//    }
//
//    //팔로우 여부 확인
//    public boolean find(long followId, String memberEmail) {
//        if (followRepository.countByFollowerAndFollowingMemberEmail(followId, memberEmail) == 0)
//            return false; //팔로우 안돼 있음
//        return true; //팔로 돼 있음
//    }
//
//    @Override
//    public Follow save(String name, long followerId) {
//        return null;
//    }
//
//    @Override
//    public Long getFollowIdByFromEmailToId(String name, long followerId) {
//        return null;
//    }
//}
