package com.XuebiTicket.dao.SessionRepository.java

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.XuebiTicket.model.Session;

@Repository
public interface SessionRepository() extends JpaRepository<Session, long> {
}
