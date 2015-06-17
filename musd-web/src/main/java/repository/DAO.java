package repository;

public interface DAO<T> {
    public boolean create(T object);
    public boolean update(T object);
    public boolean remove(T object);
    public boolean findAll(T object);
}
