package com.company.springBoard.vo;

import java.sql.Timestamp;

public class Board {
    private int id;
    private int mainId;
    private int subId;
    private String email;
    private String subject;
    private String content;
    private Timestamp registerAt;
    private Timestamp removeAt;
    private int hit;

    public Board(int id, int mainId, int subId, String email, String subject, String content, Timestamp registerAt, Timestamp removeAt, int hit) {
        this.id = id;
        this.mainId = mainId;
        this.subId = subId;
        this.email = email;
        this.subject = subject;
        this.content = content;
        this.registerAt = registerAt;
        this.removeAt = removeAt;
        this.hit = hit;
    }

    public Board(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMainId() {
        return mainId;
    }

    public void setMainId(int mainId) {
        this.mainId = mainId;
    }

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", mainId=" + mainId +
                ", subId=" + subId +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", registerAt=" + registerAt +
                ", removeAt=" + removeAt +
                ", hit=" + hit +
                '}';
    }
}
