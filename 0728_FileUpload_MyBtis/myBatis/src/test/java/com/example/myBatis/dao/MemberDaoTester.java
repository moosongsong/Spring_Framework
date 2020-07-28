package com.example.myBatis.dao;

import com.example.myBatis.vo.MemberVO;
import org.junit.Ignore;
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
public class MemberDaoTester {
    @Autowired
    private ApplicationContext context;

    @Test
    public void testInsert(){
        MemberDao dao = context.getBean(MemberDao.class);
        try{
            dao.insert(new MemberVO("songe", "1234", "test", null, null));
            System.out.println("회원가입 처리가 완료되었습니다.");
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("insert fail");
        }
    }

    @Test
    public void testDelete(){
        MemberDao dao = context.getBean(MemberDao.class);
        try{
            dao.delete("songe");
            System.out.println("회원탈퇴 처리가 완료되었습니다.");
        } catch (Exception e) {
//            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void testUpdate(){
        MemberDao dao = context.getBean(MemberDao.class);
        try{
            dao.update(new MemberVO("songe08@naver.com", "1234", "wkoko", null, null));
            System.out.println("회원변경 처리가 완료되었습니다.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void testSelectByEmail(){
        MemberDao dao = context.getBean(MemberDao.class);
        try{
            MemberVO memberVO = dao.selectByEmail("songe08@naver.com");
            System.out.println("회원선택 처리가 완료되었습니다.");
            System.out.println(memberVO);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void testLogin(){
        MemberDao dao = context.getBean(MemberDao.class);
        try{
            MemberVO memberVO = dao.login("songe08@naver.com", "1234");
            System.out.println("로그인 처리가 완료되었습니다.");
            System.out.println(memberVO);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void testSelectAll(){
        MemberDao dao = context.getBean(MemberDao.class);
        try{
            List<MemberVO> list = dao.selectAll();
            System.out.println("처리가 완료되었습니다.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
