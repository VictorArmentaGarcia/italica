package com.italika.demo.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.italika.demo.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

    Page<User> findAll(Pageable pageable);

    Optional<User> findByUsername(String name);
}
