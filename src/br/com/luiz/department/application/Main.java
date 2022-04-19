package br.com.luiz.department.application;

import br.com.luiz.department.dao.DaoFactory;
import br.com.luiz.department.dao.SellerDao;
import br.com.luiz.department.entitie.Seller;

public class Main {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}
