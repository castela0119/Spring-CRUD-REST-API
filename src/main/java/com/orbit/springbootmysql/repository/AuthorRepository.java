package com.orbit.springbootmysql.repository;

import com.orbit.springbootmysql.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
