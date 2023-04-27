package com.blog.blogappappis.repository;

import com.blog.blogappappis.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Integer> {


    Optional<User> findByEmail(String email);
}
