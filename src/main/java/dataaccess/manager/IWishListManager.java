package dataaccess.manager;

import model.Products;
import model.WishProduct;

import java.util.List;

/**
 * Created by forjava on 11/14/2016.
 */
public interface IWishListManager extends ManagerGeneric<WishProduct> {
    List<Products> getProductsByUserId(int userId);
}
