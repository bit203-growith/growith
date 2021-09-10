package com.bit.growith.service;

import com.bit.growith.dao.MemberRepository;
import com.bit.growith.vo.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
//https://devlog-wjdrbs96.tistory.com/182

    //로그인
    @Override
    public Member login(Member member) {
//        member = loginRepository.checkById(member.getMemberEmail());
//
//        if(member == null) { //아이디 틀리면
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST); //LOGIN_FAIL 상태 이넘으로
//        }
//        //비번 체크
//        boolean checkPassword = passwordEncoder.matches(member.getMemberPw(), member.getMemberPw());
//        //매개변수????
//        if(checkPassword) {
//            return new ResponseEntity<>(HttpStatus.OK); //LOGIN_SUCCESS 상태 추가
//        }
        return null;
    }

    //로그아웃

    //회원가입
    @Override
    public Member join(Member member) {
        //아이디중복체크
//        member = loginRepository.checkById(member.getMemberEmail());
//        if(member!=null) { //이미 유저 존재
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);//ALREADY_MEMBER 이미 있다는 상태
//        }
//        //비밀번호 암호화
//        String encodePassword = passwordEncoder.encode(member.getMemberPw());
//        member.setMemberPw(encodePassword);
//        loginRepository.save(member);
//        return new ResponseEntity<>(HttpStatus.OK); //JOIN_SUCCESS??
        return null;
    }

    //회원탈퇴
    @Override
    public void memberDelete(Long memberId) {

        memberRepository.deleteById(memberId);
    }

    //회원정보보기

    //회원정보수정
    @Override
    public void modifyMember(Member member) {
        Long memberId = member.getMemberId();
        Optional<Member> result = memberRepository.findById(memberId);
        if(result.isPresent()) {
            member = result.get();
            member.setMemberPw(member.getMemberPw());
        }
    }

    @Override
    public Member findById(long memberId) {
        return null;
    }


}
