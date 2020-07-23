package main.java.mapper;

import main.java.vo.Member;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class MemberMapper implements RowMapper<Member> {
    @Override
    public Member mapRow(ResultSet resultSet, int i) throws SQLException {
        String email = resultSet.getString("email");
        String pass = resultSet.getString("pass");
        String nick = resultSet.getString("nick");
        Timestamp registerAt = resultSet.getTimestamp("registerAt");
        Timestamp removeAt = resultSet.getTimestamp("removeAt");

        return new Member(email, pass, nick, registerAt, removeAt);
    }
}
