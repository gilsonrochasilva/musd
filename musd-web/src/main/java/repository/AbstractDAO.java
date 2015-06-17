package repository;

public class AbstractDAO<T> implements DAO<T> {

    @Override
    public boolean create(T object) {
        return false;
    }

    @Override
    public boolean update(T object) {
        return false;
    }

    @Override
    public boolean remove(T object) {
        return false;
    }

    @Override
    public boolean findAll(T object) {
        return false;
    }
}
