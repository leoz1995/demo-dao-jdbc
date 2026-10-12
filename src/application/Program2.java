package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DepartmentDAO;
import model.dao.FactoryDAO;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDAO dpdao = FactoryDAO.createDepartmentDao();
		
		System.out.println("--- TESTE 1: department findById ---");
		Department dp = dpdao.findById(7);
		
		System.out.println(dp);
		
		System.out.println("\n--- TESTE 2: seller findAll ---");
		List<Department> list = dpdao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n--- TESTE 3: department insert ---");
		Department newDp = new Department(null, "Games");
		dpdao.insert(newDp);
		System.out.println("Inserted! new id = " + newDp.getId());
		

		System.out.println("\n--- TESTE 4: seller update ---");
		dp = dpdao.findById(2);
		dp.setName("Tecnology");
		dpdao.update(dp);
		System.out.println("Update completed.");

		System.out.println("\n--- TESTE 4: seller delete ---");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		
		dpdao.deleteById(id);
		
		sc.close();
	}
}
