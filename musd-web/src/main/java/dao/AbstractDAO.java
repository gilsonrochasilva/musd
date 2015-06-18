package dao;

import java.util.List;

public abstract class AbstractDAO<T> implements DAO<T> {

    public abstract void create(T object);

    public abstract void update(T object);

    public abstract void remove(T object);

    public abstract List<T> findAll();
}
