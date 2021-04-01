package fly.vuong.vflypetclinic.service;

import java.util.Set;

public interface CrudService <T, ID>{
    Set<T> findAll();
    T findById();
    T save(T obj);
    void deleteById(ID id);
}
