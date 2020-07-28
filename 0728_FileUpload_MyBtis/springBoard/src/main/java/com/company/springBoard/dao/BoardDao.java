package com.company.springBoard.dao;

import com.company.springBoard.exception.BoardException;
import com.company.springBoard.exception.BoardInsertException;
import com.company.springBoard.mapper.BoardMapper;
import com.company.springBoard.vo.Board;
import com.company.springBoard.vo.SearchVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("boardDao")
public class BoardDao implements Dao{
    @Autowired
    private BoardMapper mapper;

    @Override
    public List<Board> selectList() throws BoardException {
        return mapper.select();
    }

    @Override
    public Board selectById(int id) throws BoardException {
        return mapper.selectById(id);
    }

    @Override
    public void insert(Board board) throws BoardException {
        mapper.insert(board);
    }

    @Override
    public void update(Board board) throws BoardException {
        mapper.update(board);
    }

    @Override
    public void delete(int id) throws BoardException {
        mapper.delete(id);
    }

    @Override
    public int getNextMainId() throws BoardException {
        return mapper.nextMainId();
    }

    @Override
    public int getNExtSubId(int mainId) throws BoardException {
        return mapper.nextSubId(mainId);
    }

    @Override
    public List<Board> searchBySubject(SearchVo searchVo) throws BoardException {
        return null;
    }
}
