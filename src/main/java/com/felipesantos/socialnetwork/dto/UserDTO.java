package com.felipesantos.socialnetwork.dto;

import java.util.Objects;

import com.felipesantos.socialnetwork.domain.User;

public class UserDTO {
	
	private String id;
	private String name;
	private String email;
	
	public UserDTO() {}
	
	public UserDTO(User obj) {
		
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
