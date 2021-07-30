package org.launchcode.javawebdevtechjobspersistent.dataRepos;

import org.launchcode.javawebdevtechjobspersistent.models.Employer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository                    // *** Create Repository and extend CRUD ***
public interface EmployerRepository extends CrudRepository<Employer, Integer> {
}
