package com.srienath.restapp.ownrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.srienath.restapp.model.Products;
@Repository
public interface ProductsOwnRepo extends JpaRepository<Products,Integer>{
	
	
}
