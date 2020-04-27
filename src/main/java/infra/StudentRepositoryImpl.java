package infra;

import core.Student;
import core.StudentRepository;

public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public void add(Student student) {

    }

    @Override
    public boolean exists(String emailAddress) {
        return false;
    }
}
