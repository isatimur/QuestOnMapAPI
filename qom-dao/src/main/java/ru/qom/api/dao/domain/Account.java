package ru.qom.api.dao.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Account extends AbstractEntityId {

    @OneToMany(mappedBy = "account")
    Set<Box> boxes = new HashSet<Box>();
    private String login;
    private String username;
    private String password;
    private String avatar;

    public Account() {
    }

    public Account(String login, String username, String password, String avatar) {
        this.login = login;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
    }

    public Set<Box> getBoxes() {
        return boxes;
    }

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
}