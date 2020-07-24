package org.eample.mvcTest;

public class Member {
    private String email;
    private String pass;
    private String pass2;
    private String nick;

    public Member(){}

    public Member(String email, String pass, String pass2, String nick) {
        this.email = email;
        this.pass = pass;
        this.pass2 = pass2;
        this.nick = nick;
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

    public String getPass2() {
        return pass2;
    }

    public void setPass2(String pass2) {
        this.pass2 = pass2;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "Member{" +
                "email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", pass2='" + pass2 + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }
}
