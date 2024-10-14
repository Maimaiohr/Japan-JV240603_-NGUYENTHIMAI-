package com.ra.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", length = 100, unique = true, nullable = false)
    private String name;
    @Column(name = "decreption", nullable = false)
    private String decreption;
    @OneToMany(mappedBy = "category")
    private Set<Product> products;

    public Category() {
    }

    public Category(int id, String name, String decreption) {
        this.id = id;
        this.name = name;
        this.decreption = decreption;
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

    public String getDecreption() {
        return decreption;
    }

    public void setDecreption(String decreption) {
        this.decreption = decreption;
    }
}
