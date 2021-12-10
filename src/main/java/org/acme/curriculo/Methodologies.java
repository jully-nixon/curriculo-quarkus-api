package org.acme.curriculo;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;

@Entity
@Cacheable
public class Methodologies extends PanacheEntity {
    private String name;

    @Deprecated
    public Methodologies() {}

    public Methodologies(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
