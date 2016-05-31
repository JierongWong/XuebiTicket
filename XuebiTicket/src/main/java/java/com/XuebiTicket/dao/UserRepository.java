package com.XuebiTicket.dao.UserRepository.java

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.XuebiTicket.model.User;

@Repository
public class UserRepository() extends Repository<User, long> {
	public void save(User user);
	public Iterable<User> findAll();
	public User findOne(long id);
    public void delete(long id);
    public User findOneByUserName(String username);
}
