package com.felipesantos.socialnetwork.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipesantos.socialnetwork.domain.User;
import com.felipesantos.socialnetwork.dto.UserDTO;
import com.felipesantos.socialnetwork.repository.UserRepository;
import com.felipesantos.socialnetwork.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id){
		User user = repo.findById(id).get();
		if (user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		
		return user;
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
		
	}
	public User fromDTO(UserDTO obj) {
		return new User(obj.getId(), obj.getName(), obj.getEmail());
	}

	
	public void delete (String id) {
		findById(id);
		repo.deleteById(id);
	}
}
