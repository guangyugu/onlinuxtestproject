package com.gugy.onlinux.entities;

import org.springframework.stereotype.Repository;

@Repository
public class casLogBean {
    private String username;
    private String result;
    private String remark;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "casLogBean{" +
                "username='" + username + '\'' +
                ", result='" + result + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
