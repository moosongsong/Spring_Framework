package com.company.springBoard.dao;

import com.company.springBoard.exception.BoardException;
import com.company.springBoard.vo.Board;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "file:src/main/webapp/WEB-INF/spring/root-context.xml",
        "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
public class BoardDaoTester {
    @Autowired
    private ApplicationContext context;

    @Test
    public void select(){
        BoardDao dao = context.getBean(BoardDao.class);
        try {
            List<Board> list = dao.selectList();
            for (int i = 0; i < list.size(); i++) {
                Board board = list.get(i);
                System.out.println(board);
            }
        } catch (BoardException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testInsert(){
        BoardDao dao = context.getBean(BoardDao.class);
        Board board = new Board();
        board.setEmail("songe111");
        board.setSubject("test");
        board.setContent("test");
        board.setMainId(1);
        try {
            int mainId = dao.getNextMainId();
            board.setMainId(mainId);
            dao.insert(board);
            System.out.println("게시물이 등록되었습니다.");
        } catch (BoardException e) {
            System.err.println(e.getMessage());
        }
    }
}
