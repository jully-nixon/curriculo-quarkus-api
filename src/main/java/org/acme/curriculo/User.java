package org.acme.curriculo;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;

@Entity
@Cacheable
public class User extends PanacheEntity {
    private String name;
    private String address;
    private String email;
    private Number telephone;

    @Deprecated
    public User () {}

    public User(String name, String address, String email, Number telephone) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Number getTelefone() {
        return telephone;
    }

    public void setTelephone(Number telephone) {
        this.telephone = telephone;
    }
}
