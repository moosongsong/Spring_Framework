package com.example.service;

import com.example.exception.ProductException;

public interface PInsertService {
    void execute(String prodectName, int productPrice, int partId) throws ProductException;
}
