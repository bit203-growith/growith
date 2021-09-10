package com.bit.growith.service;

import com.bit.growith.vo.Tag;

import java.util.List;

public interface TagService {

    Long create(Tag tag);
    Tag get(Long tagId);
    void modify(Tag tag);
    void delete(Long tagId);
    List<Tag> getAllWithMember(String memberEmail);

}
