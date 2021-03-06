package com.XuebiTicket.dao.TicketRepository.java

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.XuebiTicket.model.Ticket;

@Repository
public interface TicketRepository() extends JpaRepository<Ticket, long> {
}
