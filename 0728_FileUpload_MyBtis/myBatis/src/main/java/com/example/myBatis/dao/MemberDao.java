package com.example.myBatis.dao;

import com.example.myBatis.mapper.MemberMapper;
import com.example.myBatis.vo.MemberVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository("memberDao")
public class MemberDao implements Dao {
//    1.
//    @Autowired
//    private JdbcTemplate template;

//    2.
//    @Autowired
//    private SqlSession session;

//    3.
    @Autowired
    private MemberMapper mapper;

    @Override
    public void insert(MemberVO memberVO) throws Exception {
//        1.
//        String sql="INSERT INTO members VALUES (?, ?, ?, DEFAULT , DEFAULT )";
//        int result = template.update(sql, memberVO.getEmail(), memberVO.getPass(), memberVO.getNick());
//        if (result == 0){
//            throw new Exception("회원 등록에 실패");
//        }

//        2.
//        session.insert("myNS.insert", memberVO);

//        3.
        mapper.insert(memberVO);
    }

    @Override
    public void update(MemberVO memberVO) throws Exception {
//        1.
//        String sql = "UPDATE members SET pass = password(?), nick=? WHERE email = ?";
//        int result = template.update(sql, memberVO.getPass(), memberVO.getNick(), memberVO.getEmail());
//        if (result == 0){
//            throw new Exception("회원정보 변경에 실패함");
//        }

//        2.
//        session.update("myNS.update", memberVO);

//        3.
        mapper.update(memberVO);
    }

    @Override
    public void delete(String email) throws Exception {
//        1.
//        String sql = "UPDATE members SET removeAt = CURRENT_TIMESTAMP WHERE email = ?";
//        int result = template.update(sql, email);
//        if (result == 0){
//            throw new Exception("회원탈퇴처리에 성공하였다.");
//        }
//        2.
//        session.update("myNS.delete", email);

//        3.
        mapper.delete(email);
    }

    @Override
    public MemberVO selectByEmail(String email) throws Exception {
//        1. using jdbc
//        String sql = "SELECT * FROM members WHERE email = ?";
//        List<MemberVO> list = template.query(sql, new RowMapper<MemberVO>() {
//            @Override
//            public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//                String email = rs.getString("email");
//                String nick = rs.getString("nick");
//                String pass = rs.getString("pass");
//                Timestamp registerAt = rs.getTimestamp("registerAt");
//                Timestamp removeAt = rs.getTimestamp("removeAt");
//                return new MemberVO(email, pass, nick, registerAt, removeAt);
//            }
//        }, email);
//        return (list.size() == 0? null : list.get(0));

//        2. using mapper
//        return session.selectOne("myNS.selectByEmail", email);

//        3.
        return mapper.selectByEmail(email);
    }

    @Override
    public List<MemberVO> selectAll() throws Exception {
//        1.
//        String sql = "SELECT * FROM members";
//        List<MemberVO> list = template.query(sql, new RowMapper<MemberVO>() {
//            @Override
//            public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//                String email = rs.getString("email");
//                String nick = rs.getString("nick");
//                String pass = rs.getString("pass");
//                Timestamp registerAt = rs.getTimestamp("registerAt");
//                Timestamp removeAt = rs.getTimestamp("removeAt");
//                return new MemberVO(email, pass, nick, registerAt, removeAt);
//            }
//        });
//        return list;

//        2.
//        return session.selectList("myNS.selectAll");

//        3.
        return mapper.selectAll();
    }

    @Override
    public MemberVO login(String email, String pass) throws Exception {
//        1.
//        String sql = "SELECT * FROM members WHERE email = ? AND pass = password(?);";
//        List<MemberVO> list = template.query(sql, new RowMapper<MemberVO>() {
//            @Override
//            public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//                String email = rs.getString("email");
//                String nick = rs.getString("nick");
//                String pass = rs.getString("pass");
//                Timestamp registerAt = rs.getTimestamp("registerAt");
//                Timestamp removeAt = rs.getTimestamp("removeAt");
//                return new MemberVO(email, pass, nick, registerAt, removeAt);
//            }
//        }, email, pass);
//        return (list.size() == 0? null : list.get(0));

//        2.
//        return session.selectOne("myNS.login", new MemberVO(email, pass, null, null, null));

//        3.
        return mapper.login(new MemberVO(email, pass, null, null, null));
    }
}
