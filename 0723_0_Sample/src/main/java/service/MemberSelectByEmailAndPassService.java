package main.java.service;

import main.java.dao.MemberDAO;
import main.java.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MemberSelectByEmailAndPassService")
public class MemberSelectByEmailAndPassService implements SelectByEmailAndPassService {
    @Autowired
    private MemberDAO dao;

    @Override
    public void execute(String email, String pass) throws Exception {
        Member member = null;
        try {
            member = dao.selectByEmailAndPass(email, pass);
            if (member == null){
                throw new Exception();
            }
            System.out.println(member);
            System.out.println("이메일과 패스워드로 사용자 찾기에 성공했습니다.");
        } catch (Exception e){
            System.out.println("이메일과 패스워드로 사용자 찾기에 실패했습니다.");
            throw e;
        }
    }
}
