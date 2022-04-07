package com.techdenovo.japps;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {
    DemoFileReader(){
        int ch;
        try {
            FileReader fileReader = new FileReader("test.txt");

            while ((ch=fileReader.read())!=-1){
                System.out.print((char)ch);
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DemoFileReader demoFileReader = new DemoFileReader();
    }
}
