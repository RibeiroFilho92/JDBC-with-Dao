package Application;

import java.util.List;

import Model.Dao.DAOFactory;
import Model.Dao.SellerDao;
import Model.Entities.Department;
import Model.Entities.Seller;

public class App {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DAOFactory.createSellerDao();
		System.out.println("Test one: find Seller by ID: ");
		Seller seller = sellerDao.findByID(3);
		System.out.println(seller);
		
		System.out.println("Test two: find Seller by Deparment: ");
		Department dp = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dp);
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("Test three: Find All sellers: ");
		list = sellerDao.findAll();
		for (Seller s : list) {
			System.out.println(s);
		}
	}

}
