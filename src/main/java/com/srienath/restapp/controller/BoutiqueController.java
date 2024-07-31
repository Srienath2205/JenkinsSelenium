package com.srienath.restapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srienath.restapp.model.Boutique;
import com.srienath.restapp.serviceimpl.BoutiqueServiceImpl;

@RestController
@RequestMapping("/boutique")
@CrossOrigin("http://localhost:3000")
public class BoutiqueController {
	BoutiqueServiceImpl service;
	
	public BoutiqueController(BoutiqueServiceImpl service) {
		super();
		this.service = service;
	}

	@PostMapping
	public String insertBoutique(@RequestBody Boutique boutique)
	{
		String msg="";
		try {
			service.addBoutique(boutique);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Boutique getBoutiqueById(@PathVariable("id") int id) {
		return service.getBoutique(id);
	}
	
	@GetMapping("/all")
	public List<Boutique> getAllBoutiques() {
		return service.getAllBoutiques();
	}
	
	@PutMapping
	public String doUpdate(@RequestBody Boutique boutique)
	{
		String msg="";
		try {
			service.updateBoutique(boutique);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteBoutiqueById(@PathVariable("id") int id) {
		String msg="";
		try {
			service.deleteBoutique(id);
			msg="Success";
		} 
		
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
	@GetMapping("/idlist")
	public List<Integer> getIDList(){
		return service.getAllId();
	}
}
