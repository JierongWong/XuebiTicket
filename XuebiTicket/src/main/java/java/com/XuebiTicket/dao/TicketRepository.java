package com.XuebiTicket.dao.UserRepository.java

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.XuebiTicket.model.User;

@Repository
public class TicketRepository() extends Repository<Ticket, long> {
	public void save(Ticket ticket);
	public Iterable<Ticket> findAll();
	public Ticket findOne(long id);
    public void delete(long id);
    public Ticket findOneByName(String username);
}
