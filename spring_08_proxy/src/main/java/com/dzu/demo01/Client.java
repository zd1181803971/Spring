package com.dzu.demo01;

public class Client {
    public static void main(String[] args) {
        //房东要出租房子
        Host host = new Host();
        //房东交给中介，中介帮房东出租房子，但是中介要有附属操作，收钱
        Proxy proxy = new Proxy(host);

        //你不用面对房东，直接找中介租房即可。
        proxy.rent();

    }
}
