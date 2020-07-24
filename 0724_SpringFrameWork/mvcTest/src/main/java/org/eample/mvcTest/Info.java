package org.eample.mvcTest;

public class Info {
    private String name;
    private String major;

    public Info(){}

    public Info(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
