package com.example.springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springcloud.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
