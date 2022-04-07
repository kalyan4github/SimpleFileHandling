package com.techdenovo.japps;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    FileDemo(){
        File file = new File("test.txt");
        try {
            boolean value = file.createNewFile();
            if (value){
                System.out.println("file created");
            }
            else {
                System.out.println("the file already exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileDemo fileDemo = new FileDemo();
    }
}
