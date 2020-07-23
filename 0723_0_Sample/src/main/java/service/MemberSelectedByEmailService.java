package main.java.service;

import main.java.dao.MemberDAO;
import main.java.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberSelectedByEmailService")
public class MemberSelectedByEmailService implements SelectByEmailService {
    @Autowired
    private MemberDAO dao;

    @Override
    public void execute(String email) throws Exception {
        Member member = null;
        try {
            member = dao.selectByEmail(email);
            if (member == null){
                throw new Exception();
            }
            System.out.println(member);
            System.out.println("이메일로 사용자 찾기에 성공했습니다.");
        } catch (Exception e){
            System.out.println("이메일로 사용자 찾기에 실패했습니다.");
            throw e;
        }
    }
}
