package action;

import dataaccess.manager.impl.ProductsManager;
import model.Brand;
import model.Category;
import model.Products;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class ProductsAction extends BaseAction {

    private String brandId;
    private String productId;
    private String name;
    private double price;
    private String description;
    private Products product;
    private ArrayList<Products> products;
    private ProductsManager productsManager;
    private String categoryId;

    private File main;
    private String mainContentType;
    private String mainFileName;

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

    public String addProduct() {
        String destPath;
        String imageName;
        try {
            destPath = "C:\\Users\\forjava\\IdeaProjects\\eShop\\web\\upload";
            long currentTime = System.currentTimeMillis();
            mainFileName = currentTime + "_" + mainFileName;
            FileUtils.copyFile(main, new File(destPath, mainFileName));
            imageName = mainFileName;
        } catch (IOException e) {
            e.printStackTrace();
            return ERROR;
        }
        Products newProduct = new Products();
        newProduct.setName(name);
        newProduct.setPrice(price);
        Brand brand = new Brand();
        brand.setId(Integer.parseInt(brandId));
        newProduct.setBrand(brand);
        Category category = new Category();
        category.setId(Integer.parseInt(categoryId));
        newProduct.setCategory(category);
        newProduct.setDescription(description);
        newProduct.setPictureUrl(imageName);
        productsManager.create(newProduct);
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMainFileName() {
        return mainFileName;
    }

    public void setMainFileName(String mainFileName) {
        this.mainFileName = mainFileName;
    }

    public String getMainContentType() {
        return mainContentType;
    }

    public void setMainContentType(String mainContentType) {
        this.mainContentType = mainContentType;
    }

    public File getMain() {
        return main;
    }

    public void setMain(File main) {
        this.main = main;
    }
}
