package com.example.dao;

import com.example.exception.PartException;
import com.example.exception.PartInsertException;
import com.example.pstmt.PartInsertCreator;
import com.example.vo.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository("partDAO")
public class PartDAO implements PDAO {
    @Autowired
    private JdbcTemplate template;

    @Override
    public void insert(Part part) throws PartException {

        KeyHolder holder = new GeneratedKeyHolder();
        String[]columns = {"partId"};
        int result = template.update(new PartInsertCreator(part, columns), holder);
        if (result == 0){
            throw new PartInsertException();
        }
        Number number = holder.getKey();
        int partId = number.intValue();
        part.setPartId(partId);
    }

    @Override
    public void update(Part part) throws PartException {

    }

    @Override
    public void delete(int id) throws PartException {

    }

    @Override
    public Part selectById(int id) throws PartException {
        return null;
    }

    @Override
    public Part selectByName(String name) throws PartException {
        return null;
    }
}
