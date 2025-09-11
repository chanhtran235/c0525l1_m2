package ss8_mvc.repository;

import ss8_mvc.entity.Teacher;

import java.util.List;

public class TeacherRepository implements ITeacherRepository{
    @Override
    public List<Teacher> findAll() {
        return null;
    }

    @Override
    public boolean add(Teacher teacher) {
        return false;
    }

    @Override
    public List<Teacher> searchBySalary(double salary) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
