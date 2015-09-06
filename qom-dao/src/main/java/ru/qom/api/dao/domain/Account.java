package ru.qom.api.dao.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ru.qom.api.dao.domain.enums.Gender;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "account")
    private Set<Box> boxes = new HashSet<>();

    @Column(unique = true)
    private String login;

    @Column(unique = true)
    private String username;

    @JsonIgnore
    @Column(nullable = false)
    private String password;

    @Column(name = "AVA_URL")
    private String avaUrl;

    @Column(name = "CREATED_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTS;

    @Column(name = "BIRTHDAY")
    @Temporal(TemporalType.DATE)
    private Date birthday;

    @Column
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(cascade = {CascadeType.ALL},
            mappedBy = "account",
            orphanRemoval = true)
    @Column(name = "ACCCOUNT_DETAILS")
    private Set<AccountDetails> accountDetailsSet = new HashSet<AccountDetails>();


    public Account() {
    }

    public Account(String login, String username, String password, String avaUrl) {
        this.login = login;
        this.username = username;
        this.password = password;
        this.avaUrl = avaUrl;
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

    public String getAvaUrl() {
        return avaUrl;
    }

    public void setBoxes(Set<Box> boxes) {
        this.boxes = boxes;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAvaUrl(String avaUrl) {
        this.avaUrl = avaUrl;
    }

    public Date getCreatedTS() {
        return createdTS;
    }

    public void setCreatedTS(Date createdTS) {
        this.createdTS = createdTS;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Set<AccountDetails> getAccountDetailsSet() {
        return accountDetailsSet;
    }

    public void setAccountDetailsSet(Set<AccountDetails> accountDetailsSet) {
        this.accountDetailsSet = accountDetailsSet;
    }
}