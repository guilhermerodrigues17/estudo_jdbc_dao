package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class App2 {
    public static void main(String[] args) {

        //Insert operation test
        System.out.println("=== Test 1: Department insert() ===");
        DepartmentDao dep = DaoFactory.createDepartmentDao();
        Department newDepartment = new Department(null, "Games");
        dep.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

    }
}
