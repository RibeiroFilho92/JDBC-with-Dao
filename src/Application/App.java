package Application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Model.Dao.DAOFactory;
import Model.Dao.SellerDao;
import Model.Entities.Department;
import Model.Entities.Seller;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println("Test four: inserting seller: ");
		Seller istdSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, dp); 
		sellerDao.insert(istdSeller);
		System.out.println("New seller inserted: ID generated " + istdSeller.getID());
		
		System.out.println("Test five: alter seller data - UPDATE: ");
		seller = sellerDao.findByID(1);
		seller.setName("Marta");
		sellerDao.update(seller);
		System.out.println("Updated");
		
		System.out.println("Test six: alter seller data - DELETE: ");
		System.out.println("Insert the Seller ID to be deleted: ");
		int ID = sc.nextInt();
		sellerDao.deleteByID(ID);
		System.out.println("Deleted");
		
		sc.close();
		
	}

}
