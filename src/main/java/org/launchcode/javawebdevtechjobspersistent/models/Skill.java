package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity                                       // *** add @Entity annotation ***
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description required")
    @Size(min = 3, max = 150, message = "Description must be between 3 and 150 characters")
    private String description;                  // *** description field ***

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    public Skill(String description) {
        this.description = description;
    }


    public Skill() {                        // *** no-arg constructor ***

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}
