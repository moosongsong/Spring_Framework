package com.example.myBatis.mapper;

import com.example.myBatis.vo.MemberVO;

import java.util.List;

public interface MemberMapper {
    MemberVO selectByEmail(String email);
    List<MemberVO> selectAll();
    MemberVO login(MemberVO memberVO);
    void insert(MemberVO memberVO);
    void update(MemberVO memberVO);
    void delete(String email);
}
