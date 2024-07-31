package com.srienath.restapp.serviceimpl;

import com.srienath.restapp.service.ProductsService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.srienath.restapp.model.Products;
import com.srienath.restapp.ownrepo.ProductsOwnRepo;

@Service
public class ProductsServiceImpl implements ProductsService{
	@Autowired
	ProductsOwnRepo ownrepo;

	@Override
	public String addProduct(Products products) {
		if(ownrepo != null) {
			ownrepo.save(products);
			return "Success";
		}
		else {
			return "Fail to Add";
		}	
	}
	
	@Override
	public Products getProduct(int id) {
		return ownrepo.findById(id).get();
	}

	@Override
	public List<Products> getAllProducts() {
		return ownrepo.findAll();
	}

	@Override
	public String updateProduct(Products products) {
		if(ownrepo != null) {
			ownrepo.save(products);
			return "Success";
		}
		else {
			return "Fail to Add";
		}
	}
	
	@Override
	public String deleteProduct(int id) {
		Products products = ownrepo.findById(id).orElse(null);
	    if (products != null) {
	        ownrepo.deleteById(id);
	        return "Deleted";
	    } else {
	        return "Failed to delete";
	    }
	}
	
}
