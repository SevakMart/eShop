package action;

import com.opensymphony.xwork2.ActionSupport;
import dataaccess.manager.impl.BrandManager;
import dataaccess.manager.impl.CategoryManager;
import model.Brand;
import model.Category;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import java.util.ArrayList;
import java.util.Map;


public class BaseAction extends ActionSupport implements SessionAware, ServletContextAware {
    Map<String, Object> session;
    private Map<String, ArrayList<Category>> categories;
    private ArrayList<Brand> brands;
    CategoryManager categoryManager;
    BrandManager brandManager;

    public BaseAction() {
        categoryManager = new CategoryManager();
        brandManager = new BrandManager();
    }

    public void setSession(Map<String, Object> map) {
        session = map;
    }

    void invalidate() {
        session.clear();
    }

    public void setServletContext(ServletContext servletContext) {

        brands = (ArrayList<Brand>) brandManager.getAll();
        categories = categoryManager.getCategories();

        System.out.println(categories);
        servletContext.setAttribute("categories", categories);
        servletContext.setAttribute("brands",brands);
    }

}
