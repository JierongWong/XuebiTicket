package com.XuebiTicket.dao.UsonDataRepository.java

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.XuebiTicket.model.JsonData;

@Repository
public interface JsonDataRepository() extends Repository<JsonData, long> {
}
