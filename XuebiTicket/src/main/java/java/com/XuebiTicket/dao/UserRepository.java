package com.XuebiTicket.dao.UserRepository.java

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.XuebiTicket.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, long> {
	User findByUserName(String username);
}
