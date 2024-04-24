package org.example;

import org.example.drive.HDDDrive;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        HDDDrive drive = new HDDDrive();
        new Computer(new Monitor(), new HDDDrive());
    }
}