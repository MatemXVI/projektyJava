package pl.computer.drive;

import pl.computer.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
