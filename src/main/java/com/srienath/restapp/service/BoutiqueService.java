package com.srienath.restapp.service;

import java.util.List;

import com.srienath.restapp.model.Boutique;

public interface BoutiqueService {
	public String addBoutique(Boutique boutique);
	
	public Boutique getBoutique(int id);
	
	public List<Boutique> getAllBoutiques();
	
	public String updateBoutique(Boutique boutique);
	
	public String deleteBoutique(int id);
	
	List<Integer> getAllId();
}
