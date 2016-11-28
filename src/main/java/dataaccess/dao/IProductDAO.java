package dataaccess.dao;

import model.Products;

import java.util.List;

/**
 * Created by forjava on 11/9/2016.
 */
public interface IProductDAO extends GenericDAO<Products> {
    List<Products> getProductByCatId(int id);

    List<Products> getProductsByBrandId(int id);

    List<Products> searchProductsByName(String name);
}
