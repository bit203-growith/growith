package com.bit.growith.service;

import com.bit.growith.dao.RecruitBoardsRepliesRepository;
import com.bit.growith.dao.RecruitBoardsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RecruitBoardsService {

    @Autowired
    private RecruitBoardsRepository recruitBoardsRepositoty;
    @Autowired
    private RecruitBoardsRepliesRepository recruitBoardsRepliesRepository;
}
