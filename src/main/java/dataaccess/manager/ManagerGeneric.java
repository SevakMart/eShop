package dataaccess.manager;

import java.util.List;

/**
 * Created by forjava on 11/8/2016.
 */
public interface ManagerGeneric<E> {

    void create(E e);

    E getEntityByID(int id);

    List<E> getAll();

    void update(E entity);

    void delete(E entity);

}
