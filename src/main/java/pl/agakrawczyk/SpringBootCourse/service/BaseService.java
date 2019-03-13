package pl.agakrawczyk.SpringBootCourse.service;

import java.util.List;

public interface BaseService<T> {
    //CRUD
    //Create Read UPdate Delete
    public T save (T t);
    public T read(int id);
    public T readAll(List<Integer> list);
    public void update(T t);
    public void delte(int id);
    public void delet(T t);
}
