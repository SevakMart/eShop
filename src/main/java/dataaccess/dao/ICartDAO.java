package dataaccess.dao;

import model.Cart;

import java.util.List;

/**
 * Created by forjava on 11/28/2016.
 */
public interface ICartDAO extends GenericDAO<Cart> {
    List<Cart> getProductsFromCart(int id);
}
