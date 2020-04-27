package core;

import java.util.UUID;

public class University {
    private UUID id;
    private String name;
    private EbookPackage ebookPackage;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public EbookPackage getEbookPackage() {
        return ebookPackage;
    }
}
