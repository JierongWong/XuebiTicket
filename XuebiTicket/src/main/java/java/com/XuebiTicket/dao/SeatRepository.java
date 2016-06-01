package com.XuebiTicket.dao.SeatRepository.java

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.XuebiTicket.model.Seat;

@Repository
public interface SeatRepository() extends JpaRepository<Seat, long> {
}
