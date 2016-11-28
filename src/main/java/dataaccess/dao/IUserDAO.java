package dataaccess.dao;

import model.User;

/**
 * Created by forjava on 11/8/2016.
 */
public interface IUserDAO extends GenericDAO<User> {

    User getUserByEmailAndPassword(String email, String password);

}
