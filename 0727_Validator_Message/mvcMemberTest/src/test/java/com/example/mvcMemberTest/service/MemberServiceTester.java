package com.example.mvcMemberTest.service;

import com.example.mvcMemberTest.command.MemberCommand;
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
public class MemberServiceTester {
    @Autowired
    ApplicationContext ctx;

//    @Test
//    @Ignore
//    public void testMemberLoginService(){
//        MemberLoginService service = ctx.getBean("login",MemberLoginService.class);
//        try{
//            service.execute("songe08@naver.com", "1234");
//            System.out.println("로그인 성공");
//        } catch (Exception e){
//            System.out.println("로그인 실패");
//        }
//    }

    @Test
    public void testMemberInsertService(){
        MemberInsertService service = ctx.getBean(MemberInsertService.class);
        try{
            MemberCommand member = new MemberCommand("1234777@gmail.com", "1234", "1234", "epep");
            service.execute(member);
            System.out.println("가입 성공");
        } catch (Exception e){
            System.out.println("가입 실패");
        }
    }
}
