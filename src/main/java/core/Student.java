package core;

import java.util.UUID;

public abstract class Student {

    protected int STANDARD_ALLOWANCE = 10;

    private String emailAddress;
    private UUID universityId;
    protected int monthlyEbookAllowance;
    private int currentlyBorrowedEbooks;

    public Student(String emailAddress, UUID universityId) {
        this.emailAddress = emailAddress;
        this.universityId = universityId;
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
