package org.launchcode.javawebdevtechjobspersistent.dataRepos;


import org.launchcode.javawebdevtechjobspersistent.models.Skill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository                        // *** Same as EmployerRepository ***
public interface SkillRepository extends CrudRepository<Skill, Integer> {
}
