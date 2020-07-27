package com.example.validator.dao;


import com.example.validator.exception.MemberException;
import com.example.validator.vo.MemberVO;

public interface DAO {
    void insert(MemberVO member) throws MemberException;
    void update(MemberVO memberVO) throws MemberException;
}
