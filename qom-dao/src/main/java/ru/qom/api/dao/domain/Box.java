package ru.qom.api.dao.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@JsonIgnoreProperties(value = "account")
public class Box extends AbstractEntityId {

    @ManyToOne
    private Account account;
    private String username;
    private String title;
    private String body;
    private String boxtype;

    public Box() {
    }

    public Box(String username, String title, String body, String boxtype) {
        this.username = username;
        this.title = title;
        this.body = body;
        this.boxtype = boxtype;
    }

    public Account getAccount() {
        return account;
    }

    public String getBoxtype() {
        return boxtype;
    }

    public String getUsername() {
        return username;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getBoxType() {
        return boxtype;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}