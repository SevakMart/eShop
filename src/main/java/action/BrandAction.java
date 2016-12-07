package action;

import dataaccess.manager.impl.BrandManager;
import model.Brand;

/**
 * Created by forjava on 12/7/2016.
 */
public class BrandAction extends BaseAction {

    private String name;
    BrandManager brandManager = new BrandManager();


    public String addBrand() {
        Brand brand = new Brand();
        brand.setName(name);
        brandManager.create(brand);

        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
