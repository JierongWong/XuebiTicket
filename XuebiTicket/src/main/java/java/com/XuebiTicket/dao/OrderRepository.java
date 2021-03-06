package com.XuebiTicket.dao.OrderRepository.java

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.XuebiTicket.model.User;

@Repository
public interface OrderRepository() extends JpaRepository<Order, long> {
}
