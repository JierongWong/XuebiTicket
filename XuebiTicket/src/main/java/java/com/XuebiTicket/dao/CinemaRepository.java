package com.XuebiTicket.dao.CinemaRepository.java

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.XuebiTicket.model.Cinema;

@Repository
public interface CinemaRepository() extends JpaRepository<Cinema, long> {
	List<Seat> findByHallId(long id);
}
