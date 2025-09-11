package ss8_mvc.repository;

import ss8_mvc.entity.Student;
import ss8_mvc.entity.Teacher;

import java.util.List;

public interface ITeacherRepository extends IRepository<Teacher> {

    List<Teacher> searchBySalary(double salary);
}
