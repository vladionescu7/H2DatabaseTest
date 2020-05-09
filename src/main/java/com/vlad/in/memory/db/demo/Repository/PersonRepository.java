package com.vlad.in.memory.db.demo.Repository;

import com.vlad.in.memory.db.demo.Entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
