package com.pratiti.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pratiti.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
	@Query("select u from User u where u.email=?1")
	Optional<User> findByEmail(String email);

	boolean existsByEmail(String email);

}
