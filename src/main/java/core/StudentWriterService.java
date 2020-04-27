package core;

import java.util.List;
import java.util.UUID;

public interface StudentWriterService {
    void add(String emailAddress, UUID universityId);

    void addBonusAllowances();
}
