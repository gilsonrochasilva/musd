package dao;

import java.util.List;

public abstract class AbstractDAO<T> implements DAO<T> {

    @Override
    public abstract void create(T object);

    @Override
    public abstract void update(T object);

    @Override
    public abstract void remove(T object);

    @Override
    public abstract List<T> findAll();
}
