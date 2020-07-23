package com.example.dao;

import com.example.exception.PartException;
import com.example.vo.Part;

public interface PDAO {
    void insert(Part part) throws PartException;
    void update(Part part) throws PartException;
    void delete(int id) throws PartException;
    Part selectById(int id) throws PartException;
    Part selectByName(String name) throws PartException;
}
