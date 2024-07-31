package com.srienath.restapp.ownrepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.srienath.restapp.model.Boutique;

@Repository
public interface BoutiqueOwnRepo extends JpaRepository<Boutique,Integer>{
	@Query("select boutiqueID from Boutique")
	public List<Integer> getIDList();
	
}
