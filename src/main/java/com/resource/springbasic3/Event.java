package com.resource.springbasic3;

import javax.validation.constraints.*;

public class Event {
    public Event(Integer id) {
        this.id = id;
    }

    private Integer id;

    @NotEmpty
    private String title;

    @Min(0)
    private Integer limit;

    @Email
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
