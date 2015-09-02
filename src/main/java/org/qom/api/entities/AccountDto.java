package org.qom.api.entities;

import javax.persistence.Entity;

@Entity
public class AccountDto extends AbstractEntityIdDto {

    public AccountDto() {
    }

    private String login;

    private String username;

    private String password;

    private String avatar;

    public String getLogin() {
        return login;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAvatar() {
        return avatar;
    }

    public AccountDto(String login, String username, String password, String avatar) {
        this.login = login;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
    }
}