package action;

import dataaccess.manager.impl.BrandManager;
import model.Brand;

import java.util.List;

/**
 * Created by forjava on 12/7/2016.
 */
public class BrandAction extends BaseAction {

    private String brandId;
    private String name;
    BrandManager brandManager = new BrandManager();
    private List<Brand> brands;
    private Brand brand;

    public String addBrand() {
        brand = new Brand();
        brand.setName(name);
        brandManager.create(brand);
        brands = brandManager.getAll();
        application.put("brands", brands);
        return SUCCESS;
    }

    public String delete() {
        brand = brandManager.getEntityByID(Integer.parseInt(brandId));
        if (brand != null) {
            brandManager.delete(brand);
            return SUCCESS;
        }
        return ERROR;
    }

    public String view() {
        brand = brandManager.getEntityByID(Integer.parseInt(brandId));
        if (brand != null) {
            return SUCCESS;
        }
        return ERROR;
    }

    public String update() {
        brand = brandManager.getEntityByID(Integer.parseInt(brandId));
        if (brand != null) {
            brand.setName(name);
            brandManager.update(brand);
            return SUCCESS;
        }
        return ERROR;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
