package org.acme.curriculo;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;

@Entity
@Cacheable
public class Hobbies extends PanacheEntity {
    private String name;

    @Deprecated
    public Hobbies() {}

    public Hobbies(String name) {
        this.name = name;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }
}
