package core;

import java.util.List;
import java.util.UUID;

public class StudentWriterServiceImpl implements StudentWriterService {

    private StudentRepository studentRepository;
    private UniversityRepository universityRepository;
    private Logger logger;
    private StudentFactory studentFactory;

    public StudentWriterServiceImpl(StudentRepository studentRepository, UniversityRepository universityRepository, Logger logger) {
        this.studentRepository = studentRepository;
        this.universityRepository = universityRepository;
        this.logger = logger;
    }

    @Override
    public void add(String emailAddress, UUID universityId)
    {
        logger.logFormat("Log: Start add student with email '%s'", emailAddress);

        if (studentRepository.exists(emailAddress))
        {
            throw new IllegalStateException("Student already exists");
        }

        University university = universityRepository.getById(universityId);

        Student student = studentFactory.create(emailAddress, universityId, university.getEbookPackage());

        studentRepository.add(student);

        logger.logFormat("Log: End add student with email '%s'", emailAddress);
    }

    @Override
    public void addBonusAllowances() {
        List<LimitedStudent> students = studentRepository.getStudentsForBonusAllowance();
        students.forEach(student -> student.addBonusAllowance());
    }
}
