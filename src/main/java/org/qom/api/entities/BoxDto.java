package org.qom.api.entities;

import javax.persistence.Entity;

@Entity
public class BoxDto extends AbstractEntityIdDto {

    public BoxDto() {
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

    public BoxDto(String username, String title, String body, String boxtype) {
        this.username = username;
        this.title = title;
        this.body = body;
        this.boxtype = boxtype;
    }
}