package com.example.service;

import com.example.dao.ProductDAO;
import com.example.exception.ProductException;
import com.example.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productInsertService")
public class ProductInsertService implements PInsertService {
    @Autowired
    private ProductDAO dao;

    @Override
    public void execute(String productName, int productPrice, int partId) throws ProductException {
        Product product = new Product();
        product.setProductName(productName);
        product.setProductPrice(productPrice);
        product.setPartId(partId);
        dao.insert(product);
        System.out.println(product);
    }
}
