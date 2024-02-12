package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Progam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		
		
		System.out.println("=== TEST 2: seller findById ===");
		Department department = new Department(4, null);
		List<Seller> list = sellerDao.findByDepartment(department); 
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------"); 
		
		System.out.println("=== TEST 3: seller findAll ===");
		
		list = sellerDao.findALL(); 
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------"); 
		
		//System.out.println("=== TEST 4: seller insert ===");
		//Seller newSeller = new Seller(null, "Robert", "Robert@gmail.com", new Date(), (double) 5500, department);
		//sellerDao.insert(newSeller);
		
		//System.out.println("Inserted! new id = " + newSeller.getId());
	
		System.out.println("----------------------------------------------------------------------------------------------------------------------"); 

		System.out.println("=== TEST 5: seller update ===");
		seller = sellerDao.findById(5);
		seller.setName("Carlinhos");
		sellerDao.udpate(seller);
		System.out.println("update completed");
   
	
	
	System.out.println("----------------------------------------------------------------------------------------------------------------------"); 
	
	System.out.println("=== TEST 6: seller update ===");
	System.out.println("Enter id for delete test: ");
	int id = sc.nextInt();
	sellerDao.deleteById(id);
	System.out.println("Deleted completed");
 }
}