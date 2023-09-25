package com.example.webdistribue;

import org.hibernate.annotations.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Job {
    @Id
    @GeneratedValue
    private Integer id;

    private String service;
    private Boolean etat;

    public Job() {
    }

    public Job(String service, Boolean etat) {
        this.service = service;
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public String getService() {
        return service;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }
}
