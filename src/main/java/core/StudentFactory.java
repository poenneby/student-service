package core;

import java.util.UUID;

public class StudentFactory {

    public Student create(String emailAddress, UUID universityId, EbookPackage ebookPackage) {
        switch (ebookPackage) {
            case STANDARD: return new StandardStudent(emailAddress, universityId);
            case PREMIUM: return new PremiumStudent(emailAddress, universityId);
            default:return new UnlimitedStudent(emailAddress, universityId);
        }
    }
}
