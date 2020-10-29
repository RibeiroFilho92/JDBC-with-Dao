package Application;

import java.util.Date;

import Model.Dao.DAOFactory;
import Model.Dao.SellerDao;
import Model.Entities.Department;
import Model.Entities.Seller;

public class App {

	public static void main(String[] args) {
		
		Department dp = new Department(1, "Book");
		
		System.out.println(dp);

		Seller seller = new Seller(21, "Smith", "smith@gmail.com", new Date(), 3000.00, dp);
		
		SellerDao sellerDao = DAOFactory.createSellerDao();
		
		System.out.println(seller);
	}

}
