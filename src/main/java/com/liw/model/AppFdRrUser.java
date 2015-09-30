package com.liw.model;

import java.util.Date;

public class AppFdRrUser {
    private String id;

    private Date datecreated;

    private Date datemodified;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Date getDatemodified() {
        return datemodified;
    }

    public void setDatemodified(Date datemodified) {
        this.datemodified = datemodified;
    }
}