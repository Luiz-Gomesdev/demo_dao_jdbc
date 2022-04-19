package br.com.luiz.department.dao;

import java.util.List;

import br.com.luiz.department.entitie.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Department obj);
	Department findById(Integer id);
	List<Department> findAll();
}
