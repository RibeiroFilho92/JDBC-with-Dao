package Model.Dao;

import Model.Dao.implementation.SellerDaoJDBC;

public class DAOFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
