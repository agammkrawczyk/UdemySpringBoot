package pl.agakrawczyk.SpringBootCourse.service;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.agakrawczyk.SpringBootCourse.persistence.model.BaseEntity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface BaseService<T extends BaseEntity, K extends Serializable, R extends JpaRepository<T, K>> {

    //CRUD
    //Create Read UPdate Delete
    R getRepository();

    T save(T entity);

    T delete(K id);

    Collection<T> getAll();

    T getOne(K id);

}
