package com.VotingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.VotingSystem.entity.AdminLogin;

@Repository
public interface AdminLoginRepository extends JpaRepository<AdminLogin, Integer> {
    AdminLogin findByUsername(String username);
}
