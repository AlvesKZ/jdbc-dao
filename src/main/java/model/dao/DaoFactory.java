package model.dao;

import model.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerSao() {
        return new SellerDaoJDBC();
    }
}
