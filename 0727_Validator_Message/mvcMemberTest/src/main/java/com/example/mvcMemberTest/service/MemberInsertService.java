package com.example.mvcMemberTest.service;

import com.example.mvcMemberTest.command.MemberCommand;
import com.example.mvcMemberTest.dao.MemberDao;
import com.example.mvcMemberTest.exception.MemberException;
import com.example.mvcMemberTest.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberInsertService")
public class MemberInsertService implements InsertService{
    @Autowired
    MemberDao memberDao;

    @Override
    public void execute(MemberCommand member) throws MemberException {
        MemberVO memberVO = new MemberVO();
        memberVO.setEmail(member.getEmail());
        memberVO.setPass(member.getPass());
        memberVO.setNick(member.getNick());
        memberDao.insert(memberVO);
    }
}
