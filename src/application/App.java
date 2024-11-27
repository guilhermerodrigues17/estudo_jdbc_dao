package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        System.out.println("\n=== Test 4: seller insert() ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, new Department(3, null));
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n=== Test 5: seller update() ===");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println("\n=== Test 6: seller delete() ===");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }
}
