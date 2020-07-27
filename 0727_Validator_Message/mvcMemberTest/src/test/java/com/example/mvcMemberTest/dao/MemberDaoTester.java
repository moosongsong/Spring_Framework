package com.example.mvcMemberTest.dao;

import com.example.mvcMemberTest.vo.MemberVO;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "file:src/main/webapp/WEB-INF/spring/root-context.xml",
        "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
public class MemberDaoTester {
    @Autowired
    ApplicationContext ctx;

    @Test
    @Ignore
    public void testLogin(){
        MemberDao dao = ctx.getBean("memberDao", MemberDao.class);
        try{
            MemberVO member = dao.login("songe08@naver.com", "1234");
            System.out.println("회원 정보 취득에 성공하였습니다.");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    @Ignore
    public void testInsert(){
        MemberDao dao = ctx.getBean("memberDao", MemberDao.class);
        try{
            MemberVO member = new MemberVO("1234@gmail.com", "1234", "slr", null, null);
            dao.insert(member);
            System.out.println("회원가입에 성공하였습니다.");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
