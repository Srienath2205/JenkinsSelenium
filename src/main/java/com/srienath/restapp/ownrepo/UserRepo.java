package com.srienath.restapp.ownrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
 
import com.srienath.restapp.model.User;
 
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
 
	@Query(value = "SELECT u FROM User u WHERE u.email = :email")
    public User findByEmail(@Param("email") String email);
 
}