package Application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Model.Dao.DAOFactory;
import Model.Dao.DepartmentDao;
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
		
		System.out.println("Test two: find Seller by Department: ");
		Department dp = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dp);
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("Test three: Find all sellers: ");
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

		DepartmentDao departmentDao = DAOFactory.createDepartmentDao();
		Department istdDP = new Department(null, "Music");

		System.out.println("Test seven: find Department by ID: ");
		Department department = departmentDao.findByID(1);
		System.out.println(department);
		
		List<Department> list2 = departmentDao.findAll();
		System.out.println("Test eight: Find all departments: ");
		for (Department d : list2) {
			System.out.println(d);
		}
		
		System.out.println("Test nine: inserting department: ");
		departmentDao.insert(istdDP);
		System.out.println("New department inserted: ID generated " + istdDP.getID());
		
		System.out.println("Test ten: alter department data - UPDATE: ");
		istdDP = departmentDao.findByID(7);
		istdDP.setName("Supplements UPT");
		departmentDao.update(istdDP);
		System.out.println("Updated");

		System.out.println("Test eleven: alter department data - DELETE: ");
		System.out.println("Insert the Department ID to be deleted: ");
		int id = sc.nextInt();
		departmentDao.deleteByID(id);
		System.out.println("Deleted");
		sc.close();
		
	}

}
