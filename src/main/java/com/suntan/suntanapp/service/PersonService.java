package com.suntan.suntanapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suntan.suntanapp.entity.PersonEntity;
import com.suntan.suntanapp.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public void savePerson(PersonEntity personEntity) {
		personRepository.save(personEntity);
	}
}
