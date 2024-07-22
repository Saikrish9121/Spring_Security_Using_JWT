package com.sai.security.user.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sai.security.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findByEmail(String email);
	

}
