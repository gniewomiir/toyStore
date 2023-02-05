package com.toyStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mytoys")
public class MyToyList {

    @Id

    private int id;
    private String name;
    private String price;

    public MyToyList(int id, String name, String price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public MyToyList() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
