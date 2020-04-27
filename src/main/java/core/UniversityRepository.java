package core;

import java.util.UUID;

public interface UniversityRepository {
    University getById(UUID universityId);
}
