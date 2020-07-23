package main.java.dao;

import main.java.mapper.MemberMapper;
import main.java.statement.MemberStatementCreator;
import main.java.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("memberDAO")
public class MemberDAO implements DAO {
    @Autowired
    private JdbcTemplate template;//id="jdbcTemplete"

    @Override
    public void insert(Member member) throws Exception {
        String sql = "INSERT INTO members(email, pass, nick) VALUES (?, ?, ?);";
        template.update(sql, member.getEmail(), member.getPass(), member.getNick());
    }

    @Override
    public void update(Member member) throws Exception {

    }

    @Override
    public void delete(String email) throws Exception {

    }

    @Override
    public Member selectByEmail(String email) throws Exception {
        List<Member> list = null;
        String sql="SELECT * FROM members WHERE email = ?";
        list = template.query(sql, new MemberMapper(), email);

        return ( list.size() == 0 ? null : list.get(0) );
    }

    @Override
    public Member selectByEmailAndPass(final String email, final String pass) throws Exception {
        List<Member> list = null;
        list = template.query(new MemberStatementCreator(email, pass),new MemberMapper());
        return ( list.size() == 0 ? null : list.get(0) );
    }

    @Override
    public List<Member> selectList(String column, String str) throws Exception {
        List<Member> list = null;
        String sql = "SELECT * FROM members WHERE ? = ?";
        list = template.query(sql, new MemberMapper(), column, str);
        return list;
    }
}
