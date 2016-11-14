package com.training.coolproject.justtraining.core.web.executor;

import org.apache.commons.lang3.StringUtils;

public class Authentication {

    private final String userName;

    private final String password;

    public Authentication(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public static Authentication defaultAuthentication() {
        return new Authentication(StringUtils.EMPTY, StringUtils.EMPTY);
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
