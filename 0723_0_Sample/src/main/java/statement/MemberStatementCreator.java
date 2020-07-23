package main.java.statement;

import org.springframework.jdbc.core.PreparedStatementCreator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberStatementCreator implements PreparedStatementCreator {
    private String email;
    private String pass;

    public MemberStatementCreator(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    @Override
    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM members WHERE email=? AND pass=?");
        preparedStatement.setString(1, email);
        preparedStatement.setString(2, pass);
        return preparedStatement;
    }
}
