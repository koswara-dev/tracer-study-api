package com.juaracoding.tracerstudy.repository;

import com.juaracoding.tracerstudy.model.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
	Page<Todo> findByCreatedBy(Long userId, Pageable pageable);
}
