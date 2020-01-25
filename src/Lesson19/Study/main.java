package Lesson19.Study;

import java.io.FileNotFoundException;

public class main {
    public static void main(String[] args) {
        String sourceFile = new String();
        String destinationFile = new String();

        FileCopyUtilsImpl fileCopy = new FileCopyUtilsImpl();

        sourceFile = "./src/lesson17/123.jpg";
        destinationFile = "./src/lesson17/homework/123.jpg";


        try {
            fileCopy.copyFile(sourceFile, destinationFile);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-------------");
        try {
            sourceFile = "./src/lesson17/data.txt";
            destinationFile = "./src/lesson17/homework/data1.txt";
            fileCopy.copyFile1(sourceFile, destinationFile);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-------------");
        try {
            sourceFile = "./src/lesson17/rtest.dat";
            destinationFile = "./src/lesson17/homework/rtest.dat";
            fileCopy.copyFile2(sourceFile, destinationFile);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }


    }
}
