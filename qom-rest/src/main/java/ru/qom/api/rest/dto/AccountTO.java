package ru.qom.api.rest.dto;

/**
 * Created by Тимакс on 05.09.2015.
 */
public class AccountTO {
    private String login;
    private String username;
    private String password;
    private String avatar;

    public AccountTO() {
    }

    public AccountTO(String login, String username, String password, String avatar) {
        this.login = login;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
    }
}
