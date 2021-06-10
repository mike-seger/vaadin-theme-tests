package org.vaadin.erik.data.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vaadin.erik.data.entity.SamplePerson;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, Integer> {

}