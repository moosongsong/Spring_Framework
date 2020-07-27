package com.example.mvcMemberTest.dao;

import com.example.mvcMemberTest.exception.MemberException;
import com.example.mvcMemberTest.exception.MemberInsertFailedException;
import com.example.mvcMemberTest.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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

    @Override
    public MemberVO login(String email, String pass) throws MemberException {
        String sql="SELECT  * FROM members WHERE email = ? AND pass=?;";
        List<MemberVO> members = template.query(sql, new RowMapper<MemberVO>() {
            @Override
            public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
                MemberVO memberVO = new MemberVO();
                memberVO.setEmail(rs.getString("email"));
                memberVO.setNick(rs.getString("nick"));
                memberVO.setPass(rs.getString("pass"));
                memberVO.setRegisterAt(rs.getTimestamp("registerAt"));
                memberVO.setRemoveAt(rs.getTimestamp("removeAt"));
                return memberVO;
            }
        }, email, pass);
        return ( members.size() > 0 ? members.get(0) : null);
    }
}
