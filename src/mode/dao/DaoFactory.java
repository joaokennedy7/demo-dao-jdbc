package mode.dao;

import mode.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao () {
		return new SellerDaoJDBC();
	}
}
