package com.example.myBatis.dao;

import com.example.myBatis.vo.MemberVO;

import java.util.List;

public interface Dao {
    void insert(MemberVO memberVO) throws Exception;
    void update(MemberVO memberVO) throws Exception;
    void delete(String email) throws Exception;
    MemberVO selectByEmail(String email) throws Exception;
    List<MemberVO> selectAll() throws Exception;
    MemberVO login(String email, String pass) throws Exception;
}
