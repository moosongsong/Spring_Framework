package com.example.validator.command;

public class MemberCommand {
    private String email;
    private String pass;
    private String passConfig;
    private String nick;

    public MemberCommand(){}

    public MemberCommand(String email, String pass, String passConfig, String nick) {
        this.email = email;
        this.pass = pass;
        this.passConfig = passConfig;
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

    public String getPassConfig() {
        return passConfig;
    }

    public void setPassConfig(String passConfig) {
        this.passConfig = passConfig;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "MemberCommand{" +
                "email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", passConfig='" + passConfig + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }
}
