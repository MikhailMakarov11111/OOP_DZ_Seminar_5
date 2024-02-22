package org.example.entity;

public abstract class User {
    protected String birthday;
    protected String fullname;

    public User(String birthday, String fullname) {
        this.birthday = birthday;
        this.fullname = fullname;
    }


    @Override
    public String toString() {
        return "User{" +
                "birthday='" + birthday + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

}
