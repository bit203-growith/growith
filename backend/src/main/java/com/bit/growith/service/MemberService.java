package com.bit.growith.service;

import com.bit.growith.vo.Member;

public interface MemberService {
    Member login(Member member);

    Member join(Member member);

    void memberDelete(Long memberId);

    void modifyMember(Member member);

    Member findById(long memberId);

}
