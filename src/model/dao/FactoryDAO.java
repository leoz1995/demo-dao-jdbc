package model.dao;

import model.dao.impl.SellerDAOJDBC;

public class FactoryDAO {
	
	public static SellerDAO createSellerDao() {
		return new SellerDAOJDBC();
	}
}
