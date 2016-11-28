package action;

import dataaccess.manager.impl.ProductsManager;

import model.Products;



import java.util.ArrayList;

/**
 * Created by forjava on 11/7/2016.
 */
public class HomeAction extends BaseAction  {

    private ArrayList<Products> allProducts;




    private ProductsManager productsManager;

    public HomeAction() {
        productsManager = new ProductsManager();

    }

    @Override
    public String execute() throws Exception {
        allProducts = (ArrayList<Products>) productsManager.getAll();
        return SUCCESS;
    }

    public ArrayList<Products> getAllProducts() {
        return allProducts;
    }

    public void setAllProducts(ArrayList<Products> allProducts) {
        this.allProducts = allProducts;
    }




}
