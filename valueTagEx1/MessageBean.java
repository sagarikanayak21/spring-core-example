package com.sn.spring;

public class MessageBean{
    private String msg;
    public MessageBean(String msg){
        this.msg = msg;
    }
    public void printMessage(){
        System.out.println(msg);
    }
}