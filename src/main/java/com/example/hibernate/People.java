package com.example.hibernate;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class People extends AbstractPersistable<Integer> {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "id='" + getId() + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
