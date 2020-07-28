//package com.company.springBoard.service;
//
//import com.company.springBoard.command.BoardCommand;
//import com.company.springBoard.dao.BoardDao;
//import com.company.springBoard.exception.BoardException;
//import com.company.springBoard.vo.Board;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service("boardInsertService")
//public class BoardInsertService implements InsertService{
//    @Autowired
//    BoardDao dao;
//
//    @Override
//    public void execute(BoardCommand boardCommand) throws BoardException {
//        Board board = new Board();
//        board.setEmail(boardCommand.getEmail());
//        board.setContent(boardCommand.getContent());
//        board.setSubject(boardCommand.getTitle());
//        dao.insert(board);
//    }
//}
