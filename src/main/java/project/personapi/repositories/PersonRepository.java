package project.personapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.personapi.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
