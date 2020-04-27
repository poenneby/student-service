package core;

import java.util.UUID;

public class PremiumStudent extends LimitedStudent {
    public PremiumStudent(String emailAddress, UUID universityId) {
        super(emailAddress, universityId);
        this.monthlyEbookAllowance = STANDARD_ALLOWANCE * 2;
    }

    @Override
    public void addBonusAllowance() {
        this.monthlyEbookAllowance += 10;
    }
}
