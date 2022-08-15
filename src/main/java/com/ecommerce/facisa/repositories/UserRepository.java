package com.ecommerce.facisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.facisa.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}


