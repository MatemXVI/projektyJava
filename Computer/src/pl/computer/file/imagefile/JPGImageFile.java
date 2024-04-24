package pl.computer.file.imagefile;

import pl.computer.file.File;
import pl.computer.file.FileType;

public class JPGImageFile extends AbstractImageFile {
   private int compression;


    public JPGImageFile(String name, int size, int compression){
        super(name, size);
        this.compression = compression;
    }

    public int getCompression() {
        return compression;
    }

    public void displayImage(){
        System.out.println("Display JPG");
    }
}
