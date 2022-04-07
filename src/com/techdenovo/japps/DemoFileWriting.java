package com.techdenovo.japps;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DemoFileWriting {
    DemoFileWriting(){
        System.out.println("Enter Something");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write(str);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DemoFileWriting demoFileWriting = new DemoFileWriting();
    }
}
