package com.company.springBoard.mapper;

import com.company.springBoard.vo.Board;

import java.util.List;

public interface BoardMapper {
//    List<Board> select(int startIndex, int rowCount);
    List<Board> select();
    Board selectById(int id);
    void insert(Board board);
    void update(Board board);
    void delete(int id);
    int nextMainId();
    int nextSubId(int mainId);
}
