package com.newer.spring.domain;

import java.io.Serializable;

public class RequestMessage implements Serializable {

    private static final long serialVersionUID = -4402885743321736750L;
    private String id;
    private String url;
    private String methodName;
    private String args;
    private String method;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public RequestMessage() {
    }

    public RequestMessage(String id, String url, String methodName, String args, String method) {
        this.id = id;
        this.url = url;
        this.methodName = methodName;
        this.args = args;
        this.method = method;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
