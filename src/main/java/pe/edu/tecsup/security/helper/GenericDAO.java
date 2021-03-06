package pe.edu.tecsup.security.helper;

import java.util.List;

public interface GenericDAO<T> {

    public List<T> list();

    public T get(Long t);

    public void save(T t);

    public void update(T t);

    public void delete(T t);

}
