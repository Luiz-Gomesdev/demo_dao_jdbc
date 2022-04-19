package br.com.luiz.department.dao;

import java.util.List;

import br.com.luiz.department.entitie.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Seller obj);
	Seller findById(Integer id);
	List<Seller> findAll();
}
