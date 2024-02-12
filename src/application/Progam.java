package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Progam {

	public static void main(String[] args) {
		
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
		
	}

}
