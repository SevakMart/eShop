package dataaccess.dao;

import model.WishProduct;

import java.util.List;

/**
 * Created by forjava on 11/14/2016.
 */
public interface IWhishListDAO extends GenericDAO<WishProduct> {
    List<WishProduct> getProductsFromWishList(int userId);
}
