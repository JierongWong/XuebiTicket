package com.XuebiTicket.dao.UserRepository.java

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.XuebiTicket.model.User;

@Repository
public class MovieRepository() extends Repository<Movie, long> {
	public void save(Movie movie);
	public Iterable<Movie> findAll();
	public Movie findOne(long id);
    public void delete(long id);
    public Movie findOneByName(String username);
}
