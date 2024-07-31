//package com.srienath.restapp.serviceimpl;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.srienath.restapp.model.Products;
//
//@SpringBootTest
//class ProductsServiceImplTest {
//
//	@Autowired
//	ProductsServiceImpl productsServiceImpl;
//	
//	@Test
//	void testAddProduct() {
//		Products obj= new Products(4, "Collar", "Accessory", 6, 799, null);
//		assertEquals("Success",productsServiceImpl.addProduct(obj));			
//	}
//
//	@Test
//	void testAddStudent2() {
//		Products obj= null;
//		assertEquals("Fail to Add",productsServiceImpl.addProduct(obj));		
//	}
//
//	@Test
//	void testGetAllProducts() {
//		assertNotNull(productsServiceImpl.getAllProducts());
//	}
//
//	@Test
//	void testUpdateProduct() {
//		Products obj=new Products(4, "Collar", "Accessory", 6, 799, null);
//		assertEquals("Updated",productsServiceImpl.updateProduct(obj));	
//	}
//	
//	@Test
//	 void testUpdateProduct2() {
//		Products obj=null;
//		assertEquals("Updated",productsServiceImpl.updateProduct(obj));	
//	}
//	
//	
//	@Test
//	void testDeleteProduct() {
//		assertEquals("Deleted", productsServiceImpl.deleteProduct(10));
//	}
//	
//	
//	@Test
//	void testDeleteProduct2() {
//		assertEquals("Failed to delete", productsServiceImpl.deleteProduct(13));
//	}
//	
//	@Test
//	void testGetProduct() {
//		Products products = new Products();
//		products = productsServiceImpl.getProduct(10);
//		assertNotNull(products);
//	}
//	
//	@Test
//	void testGetProduct2() {
//		Products products = new Products();
//		products = productsServiceImpl.getProduct(10);
//		assertNull(products);
//	}
//}
