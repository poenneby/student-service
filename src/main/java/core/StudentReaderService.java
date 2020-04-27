package core;

import java.util.List;

public interface StudentReaderService {
    List<Student> getStudentsByUniversity();

    List<Student> getStudentsByCurrentlyBorrowedEbooks();
}
