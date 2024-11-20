package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws StudentException {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!

        Main.divide(2,1);
       // System.out.println();
        for(Map.Entry<String, String> file : studentFiles.entrySet()){
            String key = file.getKey();
            String value = file.getValue();

            try{
                int points = checkFileExtension(value);
                System.out.println(key + "got" + points + "points");
            }catch (StudentException e){
                System.out.println("Error " + key + e.getMessage());
            }
        }
        Main.checkFileExtension( "Program.java");
    }

    public static void divide(int x, int y) {
        // Write code here!
            try {
                if (y <= 0) {
                    throw new ArithmeticException("denominator should not zero!");
                }
                System.out.println(x/y);
            } catch (ArithmeticException e) {
                System.out.println("Error " + e.getMessage());
            }
    }

    public static int checkFileExtension(String fileName) throws StudentException {
        if(fileName == null || fileName.isEmpty()){
            throw new StudentException("File name cannot be null or empty");
        }
        return fileName.endsWith(".java") ? 1 : 0;
    }

}