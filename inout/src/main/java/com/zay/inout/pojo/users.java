package com.zay.inout.pojo;

public class users {
    private  int s_id;
    private String s_name;
    private String s_password;
    private int  s_type;
    private String s_leader;
    private int s_faillog;

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_password() {
        return s_password;
    }

    public void setS_password(String s_password) {
        this.s_password = s_password;
    }

    public int getS_type() {
        return s_type;
    }

    public void setS_type(int s_type) {
        this.s_type = s_type;
    }

    public String getS_leader() {
        return s_leader;
    }

    public void setS_leader(String s_leader) {
        this.s_leader = s_leader;
    }

    public int getS_faillog() {
        return s_faillog;
    }

    public void setS_faillog(int s_faillog) {
        this.s_faillog = s_faillog;
    }

    @Override
    public String toString() {
        return "users{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_password='" + s_password + '\'' +
                ", s_type=" + s_type +
                ", s_leader='" + s_leader + '\'' +
                ", s_faillog=" + s_faillog +
                '}';
    }
}
