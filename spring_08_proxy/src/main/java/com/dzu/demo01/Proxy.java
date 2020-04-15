package com.dzu.demo01;

import javax.crypto.interfaces.PBEKey;

public class Proxy implements  Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }
    public void seeHouse(){
        System.out.println("看房子");
    }
    public void hetong(){
        System.out.println("办合同");
    }
    public void fare(){
        System.out.println("收中介费");
    }
}
