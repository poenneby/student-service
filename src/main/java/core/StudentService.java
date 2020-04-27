package core;

import java.util.List;
import java.util.UUID;

public class StudentService {

    private StudentRepository studentRepository;
    private UniversityRepository universityRepository;
    private Logger logger;

    public StudentService(StudentRepository studentRepository, UniversityRepository universityRepository, Logger logger) {
        this.studentRepository = studentRepository;
        this.universityRepository = universityRepository;
        this.logger = logger;
    }

    public boolean add(String emailAddress, UUID universityId)
    {
        logger.logFormat("Log: Start add student with email '%s'", emailAddress);

        if (studentRepository.exists(emailAddress))
        {
            return false;
        }

        University university = universityRepository.getById(universityId);

        Student student = new Student(emailAddress, universityId, university.getEbookPackage());

        studentRepository.add(student);

        logger.logFormat("Log: End add student with email '%s'", emailAddress);

        return true;
    }

    public List<Student> getStudentsByUniversity()
    {
        // ...
        return null;
    }

    public List<Student> getStudentsByCurrentlyBorrowedEbooks()
    {
        //...
        return null;
    }
}
