package com.rsa.mustang.Pojo;

public class Customer {

    String ci, cn, me, st, zp;


    public Customer(String ci, String cn, String me, String st, String zp) {
        this.ci = ci;
        this.cn = cn;
        this.me = me;
        this.st = st;
        this.zp = zp;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getMe() {
        return me;
    }

    public void setMe(String me) {
        this.me = me;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getZp() {
        return zp;
    }

    public void setZp(String zp) {
        this.zp = zp;
    }
}
