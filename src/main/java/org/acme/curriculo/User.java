package org.acme.curriculo;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Cacheable
public class User extends PanacheEntity {

    private String name;
    private String address;
    private String email;
    private Number telephone;

    @OneToMany
    private List<Hobbies> hobbies = new ArrayList<>();

    @OneToMany
    private List<AcademicEducation> academicEducations = new ArrayList<>();

    @OneToMany
    private List<ProfessionalExperience> professionalExperiences = new ArrayList<>();

    @OneToMany
    private List<Extracurriculars> extracurriculars = new ArrayList<>();

    @OneToMany
    private List<Frameworks> frameworks = new ArrayList<>();

    @OneToMany
    private List<Languages> languages = new ArrayList<>();

    @OneToMany
    private List<Methodologies> methodologies = new ArrayList<>();

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


    public List<Hobbies> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Hobbies hobbies) {
        this.hobbies.add(hobbies);
    }

    public List<Extracurriculars> getExtracurriculars() {
        return extracurriculars;
    }

    public void setExtracurriculars(Extracurriculars extracurriculars) {
        this.extracurriculars.add(extracurriculars);
    }

    public List<Frameworks> getFrameworks() {
        return frameworks;
    }

    public void setFrameworks(Frameworks frameworks) {
        this.frameworks.add(frameworks);
    }

    public List<Languages> getLanguages() {
        return languages;
    }

    public void setLanguages(Languages languages) {
        this.languages.add(languages);
    }

    public List<Methodologies> getMethodologies() {
        return methodologies;
    }

    public void setMethodologies(Methodologies methodologies) {
        this.methodologies.add(methodologies);
    }

    public List<AcademicEducation> getAcademicEducations() {
        return academicEducations;
    }

    public void setAcademicEducations(AcademicEducation academicEducations) {
        this.academicEducations.add(academicEducations);
    }

    public List<ProfessionalExperience> getProfessionalExperiences() {
        return professionalExperiences;
    }

    public void setProfessionalExperiences(ProfessionalExperience professionalExperiences) {
        this.professionalExperiences.add(professionalExperiences);
    }
}
