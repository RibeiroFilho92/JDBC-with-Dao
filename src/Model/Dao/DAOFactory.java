package Model.Dao;

import JDBC.DB;
import Model.Dao.implementation.SellerDaoJDBC;

public class DAOFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
