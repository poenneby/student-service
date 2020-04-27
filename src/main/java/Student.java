import java.util.UUID;

public class Student {
    private String emailAddress;
    private UUID universityId;
    private int monthlyEbookAllowance;
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
