package com.example.service;

import com.example.dao.PartDAO;
import com.example.exception.PartException;
import com.example.vo.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("partInsertService")
public class PartInsertService implements InsertService {
    @Autowired
    private PartDAO dao;

    @Override
    public void excute(String partName) throws PartException {
        Part part = new Part();
        part.setPartName(partName);
        dao.insert(part);
        System.out.println(part);
    }
}
