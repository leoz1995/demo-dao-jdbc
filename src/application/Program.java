package application;

import model.dao.FactoryDAO;
import model.dao.SellerDAO;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {		
		SellerDAO sellerdao = FactoryDAO.createSellerDao();
		
		System.out.println("--- TESTE 1: seller findById ---");
		Seller seller = sellerdao.findById(3);
		
		System.out.println(seller);
	}
}
