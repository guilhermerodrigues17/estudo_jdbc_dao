package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class App2 {
    public static void main(String[] args) {

        //Insert operation test for table department
        System.out.println("=== Test 1: Department insert() ===");
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Department department = new Department(null, "Food");
        departmentDao.insert(department);
        System.out.println("Inserted! New id = " + department.getId());

        //findById operation test for table department
        System.out.println("\n=== Test 2: Department findById() ===");
        department = departmentDao.findById(5);
        System.out.println(department);

        //findAll operation test for table department
        System.out.println("\n=== Test 3: Department findAll() ===");
        List<Department> departmentList = departmentDao.findAll();
        for (Department obj : departmentList){
            System.out.println(obj);
        }
    }
}
