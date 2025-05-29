package com.italika.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.italika.demo.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

    Optional<Role> findByName(String name);

}
