package action;

import dataaccess.manager.impl.CategoryManager;
import model.Category;

import java.util.List;
import java.util.Map;

/**
 * Created by forjava on 12/4/2016.
 */
public class CategoryAction extends BaseAction {
    private int id;
    private String name;
    private int parentId;
    private Category category;
    Map<Category, List<Category>> categories;
    private List<Category> allCategories;
    CategoryManager categoryManager = new CategoryManager();


    public String addCategory() {
        category = new Category();
        category.setName(name);
        category.setParent_id(parentId);
        categoryManager.create(category);
        categories = categoryManager.getCategories();
        application.put("categories", categories);
        return SUCCESS;
    }

    public String delete() {
        category = categoryManager.getEntityByID(id);
        if (category != null) {
            categoryManager.delete(category);
            return SUCCESS;
        }
        return INPUT;
    }

    public String view() {
        allCategories = categoryManager.getAll();
        category = categoryManager.getEntityByID(id);
        if (category != null)
            return SUCCESS;
        return INPUT;
    }

    public String update() {
        category = categoryManager.getEntityByID(id);
        if (category != null) {
            category.setName(name);
            category.setParent_id(parentId);
            categoryManager.update(category);
            return SUCCESS;
        }
        return INPUT;
    }


    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Category> getAllCategories() {
        return allCategories;
    }

    public void setAllCategories(List<Category> allCategories) {
        this.allCategories = allCategories;
    }
}
