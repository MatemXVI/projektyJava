package pl.computer;

import pl.computer.drive.Drive;
import pl.computer.drive.HDDDrive;
import pl.computer.file.AbstractFile;
import pl.computer.file.File;
import pl.computer.file.imagefile.GIFImageFile;
import pl.computer.file.imagefile.JPGImageFile;
import pl.computer.file.musicfile.MP3MusicFile;

public class Main {
    public static void main(String[] args) {
        MP3MusicFile mp3file = new MP3MusicFile("plik.mp3", 4000, "Marilyn Manson", "Broken Needle", 100);
        
    }
}