package com.example.validator.service;

import com.example.validator.command.MemberCommand;
import com.example.validator.dao.MemberDao;
import com.example.validator.exception.MemberException;
import com.example.validator.vo.MemberVO;
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
