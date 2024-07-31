package com.srienath.restapp.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srienath.restapp.model.Boutique;
import com.srienath.restapp.ownrepo.BoutiqueOwnRepo;
import com.srienath.restapp.service.BoutiqueService;

@Service
public class BoutiqueServiceImpl implements BoutiqueService{
	@Autowired
	BoutiqueOwnRepo ownrepo;
	
	public String addBoutique(Boutique boutique) {
		if(ownrepo != null) {
			ownrepo.save(boutique);
			return "Success";
		}
		else {
			return "Fail to Add";
		}
			
	}
	
	public Boutique getBoutique(int id) {
		return ownrepo.findById(id).get();
	}
	

	public List<Boutique> getAllBoutiques() {
		return ownrepo.findAll();
	}

	public String updateBoutique(Boutique boutique) {
		if(ownrepo != null) {
			ownrepo.save(boutique);
			return "Updated";
		}
		else {
			return "Not Updated";
		}
	}
	
	public String deleteBoutique(int id) {
		 Boutique boutique = ownrepo.findById(id).orElse(null);
		    if (boutique != null) {
		        ownrepo.deleteById(id);
		        return "Deleted";
		    } else {
		        return "Failed to delete";
		    }
	}
	
	public List<Integer> getAllId()
	{
		List<Integer> idList = ownrepo.getIDList();
		return idList;
	}
}


