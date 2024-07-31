//package com.srienath.restapp.serviceimpl;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.srienath.restapp.model.Boutique;
//
//@SpringBootTest
//class BoutiqueServiceImplTest {
//
//	@Autowired
//	BoutiqueServiceImpl boutiqueServiceImpl;
//	
//	@Test
//	void testAddBoutique() {
//		Boutique obj= new Boutique(1, "FashionLove", "fashionlove@gmail.com", "VNR", "fashion with love");
//		assertEquals("Success",boutiqueServiceImpl.addBoutique(obj));			
//	}
//
//	@Test
//	void testAddStudent2() {
//		Boutique obj= null;
//		assertEquals("Fail to Add",boutiqueServiceImpl.addBoutique(obj));		
//	}
//
//	@Test
//	void testGetAllBoutiques() {
//		assertNotNull(boutiqueServiceImpl.getAllBoutiques());
//	}
//
//	@Test
//	void testUpdateBoutique() {
//		Boutique obj=new Boutique(1, "FashionLove", "fashionlove@gmail.com", "Madurai", "fashion with love");
//		assertEquals("Updated",boutiqueServiceImpl.updateBoutique(obj));	
//	}
//	
//	@Test
//	 void testUpdateBoutique2() {
//		Boutique obj=null;
//		assertEquals("Not Updated",boutiqueServiceImpl.updateBoutique(obj));	
//	}
//	
//	
//	@Test
//	void testDeleteBoutique() {
//		assertEquals("Deleted", boutiqueServiceImpl.deleteBoutique(2));
//	}
//	
//	
//	@Test
//	void testDeleteBoutique2() {
//		assertEquals("Failed to delete", boutiqueServiceImpl.deleteBoutique(13));
//	}
//	
//	@Test
//	void testGetBoutique() {
//		Boutique boutique = new Boutique();
//		boutique = boutiqueServiceImpl.getBoutique(1);
//		assertNotNull(boutique);
//	}
//	
//	@Test
//	void testGetBoutique2() {
//		Boutique boutique = new Boutique();
//		boutique = boutiqueServiceImpl.getBoutique(8);
//		assertNull(boutique);
//	}
//
//}
