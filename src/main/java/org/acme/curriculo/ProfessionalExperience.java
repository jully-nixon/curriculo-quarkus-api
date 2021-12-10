package org.acme.curriculo;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@Cacheable
public class ProfessionalExperience extends PanacheEntity {
    private String company;
    private String office;
    private Date startDate;
    private Date endDate;
    private String activities;

    @Deprecated
    public ProfessionalExperience() {}

    public ProfessionalExperience(String company, String office, Date startDate, Date endDate, String activities) {
        this.company = company;
        this.office = office;
        this.startDate = startDate;
        this.endDate = endDate;
        this.activities = activities;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
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

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }
}
