package com.mumu.bootjpa.repository;

import com.mumu.bootjpa.entity.UserJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserJpa,Long> {
}
