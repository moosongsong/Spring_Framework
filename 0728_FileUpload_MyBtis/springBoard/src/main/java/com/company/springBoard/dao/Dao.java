package com.company.springBoard.dao;

import com.company.springBoard.exception.BoardException;
import com.company.springBoard.vo.Board;
import com.company.springBoard.vo.SearchVo;

import java.util.List;

public interface Dao {
    List<Board> selectList() throws BoardException;
    Board selectById(int id) throws BoardException;
    void insert(Board board) throws BoardException;
    void update(Board board) throws BoardException;
    void delete(int id) throws BoardException;
    int getNextMainId() throws BoardException;
    int getNExtSubId(int mainId) throws BoardException;
    List<Board> searchBySubject(SearchVo searchVo) throws BoardException;
}
