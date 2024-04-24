package pl.computer.file.imagefile;

import pl.computer.file.AbstractFile;
import pl.computer.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
        super(name,size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
