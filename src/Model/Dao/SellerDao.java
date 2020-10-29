package Model.Dao;

import java.util.List;

import Model.Entities.Seller;

public interface SellerDao {

	void insert(Seller seller);
	void update(Seller seller);
	void deleteByID(Integer ID);
	Seller findByID(Integer ID);
	List<Seller> findAll();
	
}
