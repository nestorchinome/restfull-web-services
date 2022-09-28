package com.project1.rest.webservices.restfullwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project1.rest.webservices.restfullwebservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
