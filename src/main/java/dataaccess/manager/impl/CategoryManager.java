package dataaccess.manager.impl;

import dataaccess.dao.impl.CategoryDAOImpl;
import dataaccess.manager.ICategoryManager;
import model.Category;

import java.util.*;

/**
 * Created by forjava on 11/9/2016.
 */
public class CategoryManager implements ICategoryManager {
    CategoryDAOImpl categoryDAO;

    public CategoryManager() {
        categoryDAO = new CategoryDAOImpl();
    }

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

    //return all categories with his sub categories
    public Map<String, ArrayList<Category>> getCategories() {
        int mainParentId = 0;

        Map<String, ArrayList<Category>> allCategories = new HashMap<String, ArrayList<Category>>();

//get main categories

        Set<Category> mainCategories = new HashSet<Category>(categoryDAO.getCategoriesByParentId(mainParentId));
//  get sub categories

        System.out.println(mainCategories);
        for (Category mainCategory : mainCategories) {
            allCategories.put(mainCategory.getName(), categoryDAO.getCategoriesByParentId(mainCategory.getId()));
        }
        return allCategories;
    }
}
