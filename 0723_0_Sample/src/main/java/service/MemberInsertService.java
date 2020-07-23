package main.java.service;

import main.java.dao.MemberDAO;
import main.java.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberInsertService")
public class MemberInsertService implements InsertService {
    @Autowired
    private MemberDAO dao;//@Repository("memberDAO")

    @Override
    public void execute(String email, String pass, String pass2, String nick) throws Exception {
        Member member = new Member(email, pass, nick, null, null);
        try{
            dao.insert(member);
            System.out.println(member.getNick()+"의 회원가입 처리가 완료되었습니다.");
        } catch (Exception e){
            System.out.println("회원가입 처리가 실패되었습니다.");
            throw e;
        }
    }
}
