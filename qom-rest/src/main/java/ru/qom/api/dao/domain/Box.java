package ru.qom.api.dao.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties(value = "account")
public class Box {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
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

}