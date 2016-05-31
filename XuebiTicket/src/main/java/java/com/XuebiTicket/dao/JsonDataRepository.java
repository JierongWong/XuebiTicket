package com.XuebiTicket.dao.UserRepository.java

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.XuebiTicket.model.User;

@Repository
public class JsonDataRepository() extends Repository<JsonData, long> {
	public void save(JsonData jsondata);
	public Iterable<JsonData> findAll();
	public User findOne(long id);
    public void delete(long id);
    public User findOneByName(String username);
}
