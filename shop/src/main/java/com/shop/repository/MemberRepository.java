package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.DTO.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
	Member findByEmailAndPassword(String email, String password);
}
