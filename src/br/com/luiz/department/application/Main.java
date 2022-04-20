package br.com.luiz.department.application;

import java.util.List;

import br.com.luiz.department.dao.DaoFactory;
import br.com.luiz.department.dao.SellerDao;
import br.com.luiz.department.entitie.Department;
import br.com.luiz.department.entitie.Seller;

public class Main {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}

	}

}
