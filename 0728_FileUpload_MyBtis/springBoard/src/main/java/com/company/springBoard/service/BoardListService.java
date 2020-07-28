//package com.company.springBoard.service;
//
//import com.company.springBoard.dao.BoardDao;
//import com.company.springBoard.exception.BoardException;
//import com.company.springBoard.vo.Board;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service("boardListService")
//public class BoardListService implements ListServcie{
//    @Autowired
//    BoardDao dao;
//
//    @Override
//    public List<Board> execute() throws BoardException {
//        return dao.list();
//    }
//}
