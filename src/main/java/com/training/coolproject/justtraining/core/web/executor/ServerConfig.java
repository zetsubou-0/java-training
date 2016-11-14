package com.training.coolproject.justtraining.core.web.executor;

public class ServerConfig {

    private static final int DEFAULT_PORT = 80;

    private String host;

    private int port;

    private String scheme;

    private String userName;

    private String userPassword;

    public ServerConfig(String host) {
        this(host, Authentication.defaultAuthentication());
    }

    public ServerConfig(String host, Authentication authentication) {
        this(host, 0, Scheme.HTTP, authentication);
    }

    public ServerConfig(String host, int port, Scheme scheme, Authentication authentication) {
        this.host = host;
        this.port = port == 0 ? DEFAULT_PORT : port;
        this.scheme = scheme.getName();
        userName = authentication.getUserName();
        userPassword = authentication.getPassword();
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getScheme() {
        return scheme;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }
}
