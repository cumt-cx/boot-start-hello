package com.littlesida.boot.start.auto.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = HelloProperties.HELLO_CONFIG_PREFIX)
public class HelloProperties {

    public static final  String HELLO_CONFIG_PREFIX = "hello";

    private String msg = "hello World";

    private boolean isShow = true;

    public static String getHelloConfigPrefix() {
        return HELLO_CONFIG_PREFIX;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }
}
