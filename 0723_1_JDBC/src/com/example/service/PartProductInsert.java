package com.example.service;

import com.example.vo.Part;

public interface PartProductInsert {
    void execute(String partName, String productName, int productPrice)throws Exception;
}
