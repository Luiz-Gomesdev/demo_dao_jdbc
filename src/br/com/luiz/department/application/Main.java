package br.com.luiz.department.application;

import java.util.Date;

import br.com.luiz.department.entitie.Department;
import br.com.luiz.department.entitie.Seller;

public class Main {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		System.out.println(seller);

	}

}
