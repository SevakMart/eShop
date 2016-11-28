package dataaccess.dao.impl;

import dataaccess.dao.ICategoryDAO;
import model.Category;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by forjava on 11/9/2016.
 */
public class CategoryDAOImpl implements ICategoryDAO {
    Session session = HibernateUtil.getSessionFactory().openSession();

    public void create(Category category) {

    }

    public Category getEntityByID(int id) {
        return null;
    }

    public List<Category> getAll() {
        return null;
    }

    public void update(Category entity) {

    }

    public void delete(Category entity) {

    }

    public ArrayList<Category> getCategoriesByParentId(int id) {
        return (ArrayList<Category>) session.createCriteria(Category.class).add(Restrictions.eq("parent_id", id)).list();
    }
}
