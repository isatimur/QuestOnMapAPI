package ru.qom.api.dao.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ru.qom.api.dao.domain.enums.Gender;

import javax.persistence.*;
import java.util.*;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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

    @OneToMany(mappedBy = "account")
    @Column(name = "ACCCOUNT_DETAILS")
    private List<AccountDetails> accountDetailsSet = new ArrayList<>();

    public Account() {
    }

    public Account(String login, String username, String password, String avaUrl) {
        this.login = login;
        this.username = username;
        this.password = password;
        this.avaUrl = avaUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(Set<Box> boxes) {
        this.boxes = boxes;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getAvaUrl() {
        return avaUrl;
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

    public List<AccountDetails> getAccountDetailsSet() {
        return accountDetailsSet;
    }

    public void setAccountDetailsSet(List<AccountDetails> accountDetailsSet) {
        this.accountDetailsSet = accountDetailsSet;
    }
}