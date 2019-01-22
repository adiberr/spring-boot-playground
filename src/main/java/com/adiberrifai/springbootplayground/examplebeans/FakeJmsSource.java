package com.adiberrifai.springbootplayground.examplebeans;

public class FakeJmsSource {

    private String username;
    private String password;
    private String dbUrl;

    public FakeJmsSource() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    @Override
    public String toString() {
        return "FakeJmsSource{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dbUrl='" + dbUrl + '\'' +
                '}';
    }
}
