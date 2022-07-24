package com.codegym.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String status;
    private int idphim;

    public Comment() {
    }

    public Comment(int id, String name, String status, int idphim) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.idphim = idphim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdphim() {
        return idphim;
    }

    public void setIdphim(int idphim) {
        this.idphim = idphim;
    }
}
