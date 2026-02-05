import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "Bob@email.com", new Date(), 3000D, obj);

        System.out.println("=== TEST 1: seller findById ===");
        SellerDao sellerDao = DaoFactory.createSellerSao();

        Seller seller1 = sellerDao.findById(3);

        System.out.println(seller1);

    }
}
