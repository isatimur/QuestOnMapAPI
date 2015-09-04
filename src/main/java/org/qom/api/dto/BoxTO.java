package org.qom.api.dto;

/**
 * Created by Тимакс on 05.09.2015.
 */
public class BoxTO {
    public BoxTO() {
    }

    private String username;

    private String title;

    private String body;

    private String boxtype;

    public BoxTO(String username, String title, String body, String boxtype) {
        this.username = username;
        this.title = title;
        this.body = body;
        this.boxtype = boxtype;
    }
}
