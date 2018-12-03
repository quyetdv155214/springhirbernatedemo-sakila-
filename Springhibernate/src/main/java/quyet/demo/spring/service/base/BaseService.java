package quyet.demo.spring.service.base;

import java.io.Serializable;

public interface BaseService<PK, T> {
    T findById(Serializable key);

    T saveOrUpdate(T entity);

    boolean delete(T entity);
}
