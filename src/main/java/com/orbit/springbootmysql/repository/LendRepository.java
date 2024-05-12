package com.orbit.springbootmysql.repository;

import com.orbit.springbootmysql.model.Book;
import com.orbit.springbootmysql.model.Lend;
import com.orbit.springbootmysql.model.LendStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LendRepository extends JpaRepository<Lend, Long> {
    Optional<Lend> findByBookAndStatus(Book book, LendStatus status);
}
