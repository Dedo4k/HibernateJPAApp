package app.dao;

import java.util.List;

public interface DAO {

    void create(Object obj);

    Object read(Long id);

    List<?> readAll();

    void update(Object obj);

    void delete(Object obj);
}
