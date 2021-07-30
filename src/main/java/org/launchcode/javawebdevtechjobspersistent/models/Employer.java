package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity                              // *** add @Entity annotation ***
public class Employer extends AbstractEntity {


    @NotBlank(message = "Location required")           // *** add field for location and validate ***
    @Size(min = 3, max = 75, message = "Must be between 3 and 75 characters")
    private String location;

    @OneToMany(mappedBy = "employer")        // *** add @OneToMany annotation ***
    private List<Job> jobs = new ArrayList<Job>();

    public Employer() {                 // *** add no-arg constructor ***

    }

    public Employer(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {               // *** Refactored to build relationship between Employer & Job
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
