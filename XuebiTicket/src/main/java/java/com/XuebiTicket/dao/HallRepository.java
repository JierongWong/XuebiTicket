package com.XuebiTicket.dao.HallRepository.java

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.XuebiTicket.model.Hall;

@Repository
public interface HallRepository() extends JpaRepository<Hall, long> {
	List<Hall> findByCinemaId(long id);
}
