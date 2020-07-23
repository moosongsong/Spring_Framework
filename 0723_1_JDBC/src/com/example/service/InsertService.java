package com.example.service;

import com.example.exception.PartException;

public interface InsertService {
    void excute(String partName) throws PartException;
}
