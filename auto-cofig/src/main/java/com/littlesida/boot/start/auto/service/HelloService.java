package com.littlesida.boot.start.auto.service;

public class HelloService {
    //消息内容
    private String msg;
    //是否显示消息内容
    private boolean show = true;

    public String saySomething()
    {
        return show ? "say: " + msg : "Hidden";
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setShow(boolean show) {
        this.show = show;
    }
}
