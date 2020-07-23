package main.java.dao;

import main.java.vo.Member;

import java.util.List;

public interface DAO {
    void insert(Member member) throws Exception;
    void update(Member member) throws Exception;
    void delete(String email) throws Exception;
    Member selectByEmail(String email) throws Exception;
    Member selectByEmailAndPass(String email, String pass) throws Exception;//로그인용
    List<Member> selectList(String column, String str) throws Exception;
}
