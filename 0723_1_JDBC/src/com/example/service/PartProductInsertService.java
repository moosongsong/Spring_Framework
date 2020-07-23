package com.example.service;

import com.example.dao.PartDAO;
import com.example.dao.ProductDAO;
import com.example.vo.Part;
import com.example.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("PartProductInsertService")
public class PartProductInsertService implements PartProductInsert {
    @Autowired
    ProductDAO productDAO;

    @Autowired
    PartDAO partDAO;

    @Transactional
    @Override
    public void execute(String partName, String productName, int productPrice) throws Exception {
        Part part = new Part();
        part.setPartName(partName);
        partDAO.insert(part);

        Product product = new Product();
        product.setProductName(productName);
        product.setProductPrice(productPrice);
        product.setPartId(part.getPartId());
        productDAO.insert(product);

        System.out.println(part);
        System.out.println(product);

    }
}
