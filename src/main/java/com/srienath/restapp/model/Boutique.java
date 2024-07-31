package com.srienath.restapp.model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "boutique")
public class Boutique {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "boutiqueID")
	private int boutiqueID;
	@Column(name = "boutiqueName")
	private String boutiqueName;
	@Column(name = "email")
	private String email;
	@Column(name = "address")
	private String address;
	@Column(name = "description")
	private String description;

	public int getBoutiqueID() {
		return boutiqueID;
	}

	public void setBoutiqueID(int boutiqueID) {
		this.boutiqueID = boutiqueID;
	}

	public String getBoutiqueName() {
		return boutiqueName;
	}

	public void setBoutiqueName(String boutiqueName) {
		this.boutiqueName = boutiqueName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boutique(int boutiqueID, String boutiqueName, String email, String address, String description) {
		super();
		this.boutiqueID = boutiqueID;
		this.boutiqueName = boutiqueName;
		this.email = email;
		this.address = address;
		this.description = description;
	}

	public Boutique() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Boutique [boutiqueID=" + boutiqueID + ", boutiqueName=" + boutiqueName + ", email=" + email
				+ ", address=" + address + ", description=" + description + "]";
	}

	public Boutique orElse(Object object) {
		return null;
	}

}
