package dataaccess.manager;

import model.Products;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by forjava on 11/9/2016.
 */
public interface IProductsManager extends ManagerGeneric<Products> {
    List<Products> getProductByCatId(int id);

    List<Products> getProductsByBrandId(int id);

    List<Products> searchProductsByName(String name);
}
