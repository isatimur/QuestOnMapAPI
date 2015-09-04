package org.qom.api.dto;

/**
 * Created by Тимакс on 05.09.2015.
 */
public class AccountTO {
    public AccountTO() {
    }

    private String login;

    private String username;

    private String password;

    private String avatar;

    public AccountTO(String login, String username, String password, String avatar) {
        this.login = login;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
    }
}
