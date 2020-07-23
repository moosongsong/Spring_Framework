package com.example.dao;

import com.example.exception.ProductException;
import com.example.vo.Product;

public interface PDDAO {
    void insert(Product product) throws ProductException;
    void update(Product product) throws ProductException;
    void delete(int id) throws ProductException;
    Product selectById(int id) throws ProductException;
    Product selectByName(String name) throws ProductException;
}
