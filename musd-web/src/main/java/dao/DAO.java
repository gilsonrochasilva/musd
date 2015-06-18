package dao;

import java.util.List;

public interface DAO<T> {
    public void create(T object);
    public void update(T object);
    public void remove(T object);
    public List<T> findAll();
}
