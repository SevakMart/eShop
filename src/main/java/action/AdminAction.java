package action;

import dataaccess.manager.impl.CategoryManager;
import model.Category;

import java.util.List;

/**
 * Created by forjava on 12/4/2016.
 */
public class AdminAction extends BaseAction {
    private List<Category> allCategories;
    CategoryManager categoryManager = new CategoryManager();
    @Override

    public String execute() throws Exception {
        allCategories= categoryManager.getAll();
        return SUCCESS;
    }

    public List<Category> getAllCategories() {
        return allCategories;
    }

    public void setAllCategories(List<Category> allCategories) {
        this.allCategories = allCategories;
    }
}
