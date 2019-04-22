package com.eci.cosw.springbootsecureapi.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 *
 */
public class Task {

    @Id
    private String id;

    private String owner;
    private String description;
    private String responsible;
    private String status;
    private Date dueDate;
    private String file;

    public Task() {
    }

    public Task(String owner, String description, String responsible, String status, Date dueDate, String file) {
        this.owner = owner;
        this.description = description;
        this.responsible = responsible;
        this.status = status;
        this.dueDate = dueDate;
        this.file = file;
    }

    public Task(String owner, String description, String responsible, String status, Date dueDate) {
        this.owner = owner;
        this.description = description;
        this.responsible = responsible;
        this.status = status;
        this.dueDate = dueDate;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return ("Task: {file: " + file + "}");
    }
}
