package org.acme.curriculo;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
@Cacheable
public class Curriculo extends PanacheEntity {
    @OneToOne
    private User user;

    @OneToMany
    private List<Hobbies> hobbies = new ArrayList<>();

    @OneToMany
    private List<Extracurriculars> extracurriculars = new ArrayList<>();

    @OneToMany
    private List<Frameworks> frameworks = new ArrayList<>();

    @OneToMany
    private List<Languages> languages = new ArrayList<>();

    @OneToMany
    private List<Methodologies> methodologies = new ArrayList<>();

    @Deprecated
    public Curriculo() {}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Hobbies> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobbies> hobbies) {
        this.hobbies = hobbies;
    }

    public List<Extracurriculars> getExtracurriculars() {
        return extracurriculars;
    }

    public void setExtracurriculars(List<Extracurriculars> extracurriculars) {
        this.extracurriculars = extracurriculars;
    }

    public List<Frameworks> getFrameworks() {
        return frameworks;
    }

    public void setFrameworks(List<Frameworks> frameworks) {
        this.frameworks = frameworks;
    }

    public List<Languages> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Languages> languages) {
        this.languages = languages;
    }

    public List<Methodologies> getMethodologies() {
        return methodologies;
    }

    public void setMethodologies(List<Methodologies> methodologies) {
        this.methodologies = methodologies;
    }
}
