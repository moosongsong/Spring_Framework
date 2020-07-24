package com.example.mvcMemberTest.dao;

import com.example.mvcMemberTest.exception.MemberException;
import com.example.mvcMemberTest.vo.MemberVO;

public interface DAO {
    void insert(MemberVO member) throws MemberException;
    void update(MemberVO memberVO) throws MemberException;
}
