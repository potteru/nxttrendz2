package com.example.nxttrendz2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nxttrendz2.model.Product;

public interface ProductJpaRepository extends JpaRepository<Product, Integer>{
	

}
