package com.sachin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachin.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
