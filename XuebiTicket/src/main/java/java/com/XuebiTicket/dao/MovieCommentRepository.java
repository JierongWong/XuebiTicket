package com.XuebiTicket.dao.MovieCommentRepository.java

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.XuebiTicket.model.User;

@Repository
public interface MovieCommentRepository() extends JpaRepository<MovieComment, long> {
	List<MovieComment> findByMovieId(long id);
}
