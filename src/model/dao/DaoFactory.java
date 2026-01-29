package model.dao;

import db.DB;
import db.DbException;
import model.dao.impl.SellerDaoJDBC;

import java.sql.SQLException;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        try {
            return new SellerDaoJDBC(DB.getConnection());
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }
}
