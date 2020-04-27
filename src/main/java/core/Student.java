package core;

import java.util.UUID;

public class Student {

    private int STANDARD_ALLOWANCE = 10;

    private String emailAddress;
    private UUID universityId;
    private int monthlyEbookAllowance;
    private int currentlyBorrowedEbooks;

    public Student(String emailAddress, UUID universityId, EbookPackage ebookPackage) {
        this.emailAddress = emailAddress;
        this.universityId = universityId;

        if (ebookPackage  == EbookPackage.STANDARD)
        {
            this.monthlyEbookAllowance = STANDARD_ALLOWANCE;
        }
        else if (ebookPackage == EbookPackage.PREMIUM)
        {
            this.monthlyEbookAllowance = STANDARD_ALLOWANCE * 2;
        }
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public UUID getUniversityId() {
        return universityId;
    }

    public void setUniversityId(UUID universityId) {
        this.universityId = universityId;
    }

    public int getMonthlyEbookAllowance() {
        return monthlyEbookAllowance;
    }

    public void setMonthlyEbookAllowance(int monthlyEbookAllowance) {
        this.monthlyEbookAllowance = monthlyEbookAllowance;
    }

    public int getCurrentlyBorrowedEbooks() {
        return currentlyBorrowedEbooks;
    }

}
