package core;

import java.util.List;

public interface StudentRepository {
    void add(Student student);

    boolean exists(String emailAddress);

    List<LimitedStudent> getStudentsForBonusAllowance();
}
