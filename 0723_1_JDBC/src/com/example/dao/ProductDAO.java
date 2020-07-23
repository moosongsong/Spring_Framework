package com.example.dao;

import com.example.exception.ProductException;
import com.example.vo.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository("productDAO")
public class ProductDAO implements PDDAO {
    @Autowired
    private JdbcTemplate template;

    @Override
    public void insert(Product product) throws ProductException {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        String[] column = {"productId"};
        int result = template.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                String sql = "INSERT INTO products VALUES(default , ?, ?, ?)";
                PreparedStatement pstmt = connection.prepareStatement(sql, column);
                pstmt.setString(1, product.getProductName());
                pstmt.setInt(2, product.getProductPrice());
                pstmt.setInt(3, product.getPartId());
                return pstmt;
            }
        }, keyHolder);
        if (result == 0){
            throw new ProductException();
        }
        Number number = keyHolder.getKey();
        int productId = number.intValue();
        product.setProductId(productId);
    }

    @Override
    public void update(Product product) throws ProductException {

    }

    @Override
    public void delete(int id) throws ProductException {

    }

    @Override
    public Product selectById(int id) throws ProductException {
        return null;
    }

    @Override
    public Product selectByName(String name) throws ProductException {
        return null;
    }
}
