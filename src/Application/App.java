package Application;

import Model.Dao.DAOFactory;
import Model.Dao.SellerDao;
import Model.Entities.Seller;

public class App {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DAOFactory.createSellerDao();
		Seller seller = sellerDao.findByID(3);
		System.out.println(seller);
		
	}

}
