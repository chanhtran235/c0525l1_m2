package ss8_mvc.repository;

import ss8_mvc.entity.Student;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll();
    boolean add(T t);
    boolean deleteById(int id);
}
