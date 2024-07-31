package com.srienath.restapp.model;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productID")
	private int productID;
	@Column(name = "productName")
	private String productName;
	@Column(name = "productType")
	private String productType;
	@Column(name = "stockLeft")
	private int stockLeft;
	@Column(name = "price")
	private int price;

	@ManyToOne(cascade = CascadeType.MERGE)
	private Boutique boutique;

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getStockLeft() {
		return stockLeft;
	}

	public void setStockLeft(int stockLeft) {
		this.stockLeft = stockLeft;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Boutique getBoutique() {
		return boutique;
	}

	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}

	public Products(int productID, String productName, String productType, int stockLeft, int price,
			Boutique boutique) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productType = productType;
		this.stockLeft = stockLeft;
		this.price = price;
		this.boutique = boutique;
	}

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Products [productID=" + productID + ", productName=" + productName + ", productType=" + productType
				+ ", stockLeft=" + stockLeft + ", price=" + price + ", boutique=" + boutique + "]";
	}

	public Products orElse(Object object) {
		return null;
	}

}
