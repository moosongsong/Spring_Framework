package com.example.validator.dao;

import com.example.validator.exception.MemberException;
import com.example.validator.exception.MemberInsertFailedException;
import com.example.validator.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("memberDao")
public class MemberDao implements DAO{
    @Autowired
    private JdbcTemplate template;

    @Override
    public void insert(MemberVO member) throws MemberException {
        String sql="INSERT INTO members VALUE (?, ?, ?, DEFAULT, DEFAULT)";
        int result = template.update(sql, member.getEmail(), member.getPass(), member.getNick());
        if (result == 0){
            throw new MemberInsertFailedException();
        }
    }

    @Override
    public void update(MemberVO memberVO) throws MemberException {
        String sql = "UPDATE ";
        int result = template.update(sql);
    }
}
