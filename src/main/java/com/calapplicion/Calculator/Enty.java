package com.calapplicion.Calculator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Enty")
public class Enty {
    @Id
    private Integer id;
    private  String name;
    private String cla;

    public Enty(Integer id, String name, String cla) {
        this.id = id;
        this.name = name;
        this.cla = cla;
    }
    public Enty(){}
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }
}
