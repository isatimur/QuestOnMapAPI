package ru.qom.api.rest.dto;

/**
 * Created by isa on 05.09.2015.
 */
public class AccountTO {
    private String login;
    private String username;
    private String password;
    private String avaUrl;

    public AccountTO() {
    }

    public AccountTO(String login, String username, String password, String avaUrl) {
        this.login = login;
        this.username = username;
        this.password = password;
        this.avaUrl = avaUrl;
    }
}
