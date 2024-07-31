package com.srienath.restapp.service;


import java.util.List;
import com.srienath.restapp.model.Products;

public interface ProductsService {
	public String addProduct(Products products);
	
	public Products getProduct(int id);
	
	public List<Products> getAllProducts();
	
	public String updateProduct(Products products);
	
	public String deleteProduct(int id);
	
}
