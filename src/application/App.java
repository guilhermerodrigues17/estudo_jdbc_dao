package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.println("=== Test 1: seller findById() ===");
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== Test 2: seller findByDepartment() ===");
        List<Seller> sellerList = sellerDao.findByDepartment(new Department(2, null));
        for (Seller obj : sellerList) {
            System.out.println(obj);
        }

        System.out.println("\n=== Test 3: seller findAll() ===");
        sellerList = sellerDao.findAll();
        for (Seller obj : sellerList) {
            System.out.println(obj);
        }


    }
}
