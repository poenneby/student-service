package core;

public interface StudentRepository {
    void add(Student student);

    boolean exists(String emailAddress);
}
