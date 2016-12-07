package action;


import com.opensymphony.xwork2.ActionSupport;
import dataaccess.manager.impl.BrandManager;
import dataaccess.manager.impl.CategoryManager;
import dataaccess.manager.impl.CountryManager;
import model.Brand;
import model.Category;
import model.Country;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class BaseAction extends ActionSupport implements SessionAware, ApplicationAware {
    Map<String, Object> session;
    Map<String, Object> application;
    private CategoryManager categoryManager;
    private BrandManager brandManager;
    private CountryManager countryManager;

    public BaseAction() {
        categoryManager = new CategoryManager();
        brandManager = new BrandManager();
        countryManager = new CountryManager();
    }

    public void setSession(Map<String, Object> map) {
        session = map;
    }

    void invalidate() {
        session.clear();
    }



    @Override
    public void setApplication(Map<String, Object> map) {
        application = map;
    }
}
