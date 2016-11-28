package dataaccess.dao.impl;

import dataaccess.dao.IBrandDAO;
import model.Brand;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

/**
 * Created by forjava on 11/10/2016.
 */
public class BrandDAOImpl implements IBrandDAO {

    Session session = HibernateUtil.getSessionFactory().openSession();

    public void create(Brand brand) {

    }

    public Brand getEntityByID(int id) {
        return null;
    }

    public List<Brand> getAll() {
        return session.createCriteria(Brand.class).list();
    }

    public void update(Brand entity) {

    }

    public void delete(Brand entity) {

    }
}
