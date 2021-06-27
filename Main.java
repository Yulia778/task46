package com.metanit;
import java.io.File;
public class Main {

    public static void main(String[] args) {

        File folder = new File("C:\\Users\\USER\\IdeaProjects\\task47\\data");
        File[] listOfFiles = folder.listFiles();
        {

            for (int i = 0; i < listOfFiles.length; i++) {

                if (listOfFiles[i].isFile()) {
                   String files = listOfFiles[i].getName();
                     {
                        System.out.println(files);
                    }
                }
            }
        }

    }
}