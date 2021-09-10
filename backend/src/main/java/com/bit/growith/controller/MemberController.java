package com.bit.growith.controller;

import com.bit.growith.service.MemberService;
import com.bit.growith.vo.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/login")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    //로그인
    @PostMapping(value = "/login")
    public ResponseEntity<?> login(@RequestBody Member member){
        return new ResponseEntity<>(memberService.login(member), HttpStatus.OK);
    }

    //로그아웃

    //회원가입
    //회원 정보 입력 후 회원가입 버튼 클릭
    @PostMapping(value = "")
    public ResponseEntity<?> join(@RequestBody Member member) {
        member = memberService.join(member);
        if (member == null) {
            return new ResponseEntity<>("회원가입 실패", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("회원가입 성공", HttpStatus.OK);
    }

    //회원 정보 조회
    public ResponseEntity<?> getmemberInfo(@PathVariable("memberId") long memberId) {
        Optional<Member> oMember = Optional.ofNullable(memberService.findById(memberId));

        if (!oMember.isPresent()) { //404
            return new ResponseEntity<>("일치하는 회원 정보가 없습니다.", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>("정보 조회 성공", HttpStatus.OK);
    }

    //회원 정보 수정
    @PutMapping(value = "/{memberId}", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> modifyMember(@RequestBody Member member) {

        memberService.modifyMember(member);

        return new ResponseEntity<>("modified", HttpStatus.OK);
    }

    //회원 탈퇴
    @DeleteMapping(value = "/{memberId}", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> memberDelete(@PathVariable("memberId") Long memberId) {
        memberService.memberDelete(memberId);
        return new ResponseEntity<>("delete", HttpStatus.OK);
    }
}
