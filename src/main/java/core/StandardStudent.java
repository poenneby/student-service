package core;

import java.util.UUID;

public class StandardStudent extends LimitedStudent {
    public StandardStudent(String emailAddress, UUID universityId) {
        super(emailAddress, universityId);
        this.monthlyEbookAllowance = STANDARD_ALLOWANCE;
    }

    @Override
    public void addBonusAllowance() {
        this.monthlyEbookAllowance += 5;
    }
}
