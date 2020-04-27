package core;

import jdk.nashorn.internal.objects.NativeObject;

import java.util.List;
import java.util.UUID;

public class StudentService {

    private StudentRepository studentRepository;
    private UniversityRepository universityRepository;
    private Logger logger;
    private StudentFactory studentFactory;

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

        Student student = studentFactory.create(emailAddress, universityId, university.getEbookPackage());

        studentRepository.add(student);

        logger.logFormat("Log: End add student with email '%s'", emailAddress);

        return true;
    }

    public void addBonusAllowances() {
        List<LimitedStudent> students = studentRepository.getStudentsForBonusAllowance();
        students.forEach(student -> student.addBonusAllowance());
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
