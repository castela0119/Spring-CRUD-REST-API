package com.orbit.springbootmysql.repository;

import com.orbit.springbootmysql.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
