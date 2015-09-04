package org.qom.api.dao.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Box extends AbstractEntityId {

    public Box() {
    }

    @ManyToOne
    private Account account;

    public Account getAccount() {
        return account;
    }

    public String getBoxtype() {
        return boxtype;
    }

    private String username;

    private String title;

    private String body;

    private String boxtype;

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

    public Box(String username, String title, String body, String boxtype) {
        this.username = username;
        this.title = title;
        this.body = body;
        this.boxtype = boxtype;
    }
}