package com.eci.cosw.springbootsecureapi.model;

import org.springframework.data.annotation.Id;

import java.io.InputStream;

public class File {

    @Id
    String id;

    InputStream content;
    String name;
    String type;

    public File(InputStream content, String name, String type) {
        this.content = content;
        this.name = name;
        this.type = type;
    }

    public File(InputStream content, String name) {
        this.content = content;
        this.name = name;
    }

    public File() {
    }

    public InputStream getContent() {
        return content;
    }

    public void setContent(InputStream content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }
}
