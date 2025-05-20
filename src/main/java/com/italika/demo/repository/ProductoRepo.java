package com.italika.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.italika.demo.entity.ProductoEntity;

@Repository
public interface ProductoRepo extends JpaRepository<ProductoEntity, Integer> {

}
