package ru.qom.api.rest.dto;

/**
 * Created by isa on 05.09.2015.
 */
public class BoxTO {
    private String username;
    private String title;
    private String body;
    private String boxtype;

    public BoxTO() {
    }

    public BoxTO(String username, String title, String body, String boxtype) {
        this.username = username;
        this.title = title;
        this.body = body;
        this.boxtype = boxtype;
    }
}
