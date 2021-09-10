//package com.bit.growith.controller;
//
//import com.bit.growith.dao.FollowRepository;
//import com.bit.growith.service.FollowService;
//import com.bit.growith.vo.Follow;
//import com.bit.growith.vo.Member;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/follow")
//@RequiredArgsConstructor
//public class FollowController {
//
//    private final FollowService followService;
//    private final FollowRepository followRepository;
//
////    @RequestMapping("/follow")
////    public String follow(Member member, long followId) {
////        Member followingId =
////    }
//
//    //following하는 member가 follower member를 팔로우하는 정보 추가
//    //follower -> 새로 생성된 follow 객체
//    @PostMapping("/{follower}")
//    public ResponseEntity<?> follow(@PathVariable long followerId, Authentication authentication) {
//        followService.save(authentication.getName(), followerId);
//        return new ResponseEntity<>("팔로우", HttpStatus.OK);
//    }
//
//    //following하는 member가 follower member를 팔로우하는 정보 삭제
//    //_ -> 언팔로우 당하는 멤버의 아이디 follower
//    @DeleteMapping("/{follower}")
//    public void unfollow(@PathVariable long followerId, Authentication authentication) {
//        Long id = followService.getFollowIdByFromEmailToId(authentication.getName(), followerId);
//        followRepository.deleteById(id);
//    }
//
//
//
//
//}
