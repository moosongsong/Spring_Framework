package com.example.pstmt;

import com.example.vo.Part;
import org.springframework.jdbc.core.PreparedStatementCreator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PartInsertCreator implements PreparedStatementCreator {
    private Part part;
    private String [] columns;

    public PartInsertCreator(Part part, String[] columns) {
        this.part = part;
    }

    @Override
    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
        String sql="INSERT INTO parts(partName) VALUE (?)";
        PreparedStatement pstmt = connection.prepareStatement(sql, columns);
        pstmt.setString(1,part.getPartName());
        return pstmt;
    }
}
