package dataaccess.manager;

import model.User;

/**
 * Created by forjava on 11/8/2016.
 */
public interface IUserManager extends ManagerGeneric<User> {

    User getUserByEmailAndPassword(String email, String password);
}
