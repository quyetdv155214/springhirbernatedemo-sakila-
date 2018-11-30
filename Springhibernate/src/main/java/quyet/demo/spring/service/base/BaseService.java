package quyet.demo.spring.service.base;

import java.io.Serializable;

public interface BaseService<PK, T> {
    public T findById(Serializable key);

    public T saveOrUpdate(T entity);

    public boolean delete(T entity);
}
