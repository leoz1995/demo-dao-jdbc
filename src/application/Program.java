package application;

import java.util.Date;

import model.dao.FactoryDAO;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dp = new Department(1, "Books");	
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, dp);
		
		SellerDAO sellerdao = FactoryDAO.createSellerDao();
		
		System.out.println(seller);
		
	}

}
