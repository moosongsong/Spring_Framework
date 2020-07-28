package com.example.myBatis.vo;

import java.sql.Timestamp;

public class MemberVO {
    private String email;
    private String pass;
    private String nick;
    private Timestamp registerAt;
    private Timestamp removeAt;

    public MemberVO(){}

    @Override
    public String toString() {
        return "MemberVO{" +
                "email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", nick='" + nick + '\'' +
                ", registerAt=" + registerAt +
                ", removeAt=" + removeAt +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Timestamp getRegisterAt() {
        return registerAt;
    }

    public void setRegisterAt(Timestamp registerAt) {
        this.registerAt = registerAt;
    }

    public Timestamp getRemoveAt() {
        return removeAt;
    }

    public void setRemoveAt(Timestamp removeAt) {
        this.removeAt = removeAt;
    }

    public MemberVO(String email, String pass, String nick, Timestamp registerAt, Timestamp removeAt) {
        this.email = email;
        this.pass = pass;
        this.nick = nick;
        this.registerAt = registerAt;
        this.removeAt = removeAt;
    }
}
