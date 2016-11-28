package dataaccess.manager;

import model.Cart;
import model.Products;

import java.util.List;

/**
 * Created by forjava on 11/28/2016.
 */
public interface ICartManager extends ManagerGeneric<Cart>{
    List<Products> getProductsByUserId(int id);
}
