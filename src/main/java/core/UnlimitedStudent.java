package core;

import java.util.UUID;

public class UnlimitedStudent extends Student {
    public UnlimitedStudent(String emailAddress, UUID universityId) {
        super(emailAddress, universityId);
        this.monthlyEbookAllowance = 0;
    }

}
