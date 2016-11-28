package action;

import dataaccess.manager.impl.ProductsManager;
import model.Products;

import java.util.ArrayList;


public class ProductsAction extends BaseAction {

    private String brandId;
    private String productId;
    private String name;
    private Products product;
    private ArrayList<Products> products;
    private ProductsManager productsManager;
    private String categoryId;

    public ProductsAction() {
        productsManager = new ProductsManager();
    }


    @Override
    public String execute() throws Exception {
        products = (ArrayList<Products>) productsManager.getAll();
        return SUCCESS;
    }


    public String getProductsByCatId() {
        products = (ArrayList<Products>) productsManager.getProductByCatId(Integer.parseInt(categoryId));
        return SUCCESS;
    }

    public String getProductsDetails() {
        product = productsManager.getEntityByID(Integer.parseInt(productId));
        return SUCCESS;
    }

    public String getProductsByBrandId() {

        products = (ArrayList<Products>) productsManager.getProductsByBrandId(Integer.parseInt(brandId));

        return SUCCESS;
    }

    public String search() {
        products = (ArrayList<Products>) productsManager.searchProductsByName(name);
        return SUCCESS;

    }

    public ArrayList<Products> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Products> products) {
        this.products = products;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandId() {
        return brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
