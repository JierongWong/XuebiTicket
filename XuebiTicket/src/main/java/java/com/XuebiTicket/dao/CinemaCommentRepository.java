package com.XuebiTicket.dao.CinemaCommentRepository.java

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.XuebiTicket.model.CinemaComment;

@Repository
public interface CinemaCommentRepository() extends JpaRepository<CinemaComment, long> {
	List<CinemaComment> findByCinemaId(long id);
}
