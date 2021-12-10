package org.acme.curriculo;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@Cacheable
public class AcademicEducation extends PanacheEntity {
    private String course;
    private String institution;
    private Date startDate;
    private Date endDate;

    @Deprecated
    public AcademicEducation() {}

    public AcademicEducation(String course, String institution, Date startDate, Date endDate) {
        this.course = course;
        this.institution = institution;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
