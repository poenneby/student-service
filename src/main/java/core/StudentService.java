package core;

import java.util.List;
import java.util.UUID;

public class StudentService {

    private StudentRepository studentRepository;
    private UniversityRepository universityRepository;

    public StudentService(StudentRepository studentRepository, UniversityRepository universityRepository) {
        this.studentRepository = studentRepository;
        this.universityRepository = universityRepository;
    }

    public boolean add(String emailAddress, UUID universityId)
    {
        System.out.printf("Log: Start add student with email '%s'", emailAddress);

        if (emailAddress.isEmpty())
        {
            return false;
        }

        if (studentRepository.exists(emailAddress))
        {
            return false;
        }

        University university = universityRepository.getById(universityId);

        Student student = new Student(emailAddress, universityId);

        if (university.getEbookPackage() == EbookPackage.STANDARD)
        {
            student.setMonthlyEbookAllowance(10);
        }
        else if (university.getEbookPackage() == EbookPackage.PREMIUM)
        {
            student.setMonthlyEbookAllowance(10 * 2);
        }

        studentRepository.add(student);

        System.out.printf("Log: End add student with email '%s'", emailAddress);

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
