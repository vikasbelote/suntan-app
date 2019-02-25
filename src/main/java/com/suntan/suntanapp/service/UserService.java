package com.suntan.suntanapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suntan.suntanapp.dto.RegisterDTO;
import com.suntan.suntanapp.entity.PersonEntity;
import com.suntan.suntanapp.entity.UserEntity;
import com.suntan.suntanapp.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PersonService personService;
	
	public void registerUser(RegisterDTO registerDTO) {
		
		UserEntity userEntity = new UserEntity();
		userEntity.setUserName(registerDTO.getEmailAddress());
		userEntity.setUserPassword(registerDTO.getUserPassword());
		this.saveUser(userEntity);
		
		PersonEntity personEntity = new PersonEntity();
		personEntity.setFirstName(registerDTO.getFirstName());
		personEntity.setLastName(registerDTO.getLastName());
		personEntity.setModileNumber(registerDTO.getMobileNumber());
		personEntity.setUserEntity(userEntity);
		personService.savePerson(personEntity);
	}
	
	public void saveUser(UserEntity userEntity) {
		userRepository.save(userEntity);
	}

}
