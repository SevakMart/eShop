package dataaccess.manager.impl;

import dataaccess.dao.impl.BrandDAOImpl;
import dataaccess.manager.IBrandManager;
import model.Brand;

import java.util.List;

/**
 * Created by forjava on 11/10/2016.
 */
public class BrandManager implements IBrandManager {

    BrandDAOImpl brandDAO;

    public BrandManager() {
        brandDAO = new BrandDAOImpl();
    }


    public void create(Brand brand) {

    }

    public Brand getEntityByID(int id) {
        return null;
    }

    public List<Brand> getAll() {
        return brandDAO.getAll();
    }

    public void update(Brand entity) {

    }

    public void delete(Brand entity) {

    }
}
